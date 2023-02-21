package zhuxuanyu.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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

    /**
     * 发送手机短信验证码
     *
     * @return
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
            //需要将生成的验证码存到session
            session.setAttribute(phone, code);
            return Result.success("验证码发送成功！");
        }

        return Result.error("短信发送失败！");
    }


    /**
     * 登录功能
     * @param map
     * @param session
     * @return
     */
    @PostMapping("/login")
    public Result<User> login(@RequestBody Map map, HttpSession session) {
        log.info("map:{}",map);

        //获取手机号
        String phone = map.get("phone").toString();
        //获取验证码
        String code = map.get("code").toString();
        //从session中获取验证码
        Object codeSession = session.getAttribute(phone);

        if (code!=null && codeSession.equals(code)){
            //比对验证码，成功了就通过
            //判断手机号是否为新用户，是就创建新用户
            LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
            wrapper.eq(User::getPhone,phone);
            User user = userService.getOne(wrapper);
            if (user==null){
                //如果用户不为空，就创建用户
                user = new User();
                user.setPhone(phone);
                user.setStatus(1);
                userService.save(user);
            }
            session.setAttribute("user",user.getId());
            return Result.success(user);
        }
        return Result.error("登陆失败！");
    }
}
