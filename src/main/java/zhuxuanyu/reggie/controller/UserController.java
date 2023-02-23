package zhuxuanyu.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhuxuanyu.reggie.common.Result;
import zhuxuanyu.reggie.generator.entity.User;
import zhuxuanyu.reggie.generator.service.UserService;
import zhuxuanyu.reggie.utils.ValidateCodeUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @title: UserController
 * @Author 竹玄羽
 * @Date: 2023/2/20 11:07
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final RedisTemplate<String, String> redisTemplate;

    /**
     * 发送手机短信验证码
     */
    @PostMapping("/sendMsg")
    public Result<String> sendMsg(@RequestBody User user, HttpSession session) {
        //获取手机号
        String phone = user.getPhone();

        if (StringUtils.isNotEmpty(phone)) {
            //生成随机验证码
            String code = ValidateCodeUtils.generateValidateCode(6).toString();
            log.info("code:{}", code);

            //调用阿里云短信服务发送短信
            //SMSUtils.sendMessage("竹玄羽的博客", "SMS_270380748", phone, code);

            //生成的验证码存入redis，并且有效期为五分钟
            redisTemplate.opsForValue().set(phone, code, 5, TimeUnit.MINUTES);

            return Result.success("验证码发送成功！");
        }

        return Result.error("短信发送失败！");
    }


    /**
     * 登录功能
     */
    @PostMapping("/login")
    public Result<User> login(@RequestBody Map<String, String> map, HttpSession session) {
        log.info("map:{}", map);

        //获取手机号
        String phone = map.get("phone");
        //获取验证码
        String code = map.get("code");

        //从redis获取验证码
        String codeSession = redisTemplate.opsForValue().get(phone);

        if (codeSession != null && codeSession.equals(code)) {
            //比对验证码，成功了就通过
            //判断手机号是否为新用户，是就创建新用户
            LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
            wrapper.eq(User::getPhone, phone);
            User user = userService.getOne(wrapper);
            if (user == null) {
                //如果用户不为空，就创建用户
                user = new User();
                user.setPhone(phone);
                user.setStatus(1);
                userService.save(user);
            }
            session.setAttribute("user", user.getId());
            //如果用户登陆成功，删除redis缓存验证码
            redisTemplate.delete(phone);

            return Result.success(user);
        }
        return Result.error("登陆失败！");
    }
}
