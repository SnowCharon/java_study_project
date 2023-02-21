package zhuxuanyu.reggie.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import zhuxuanyu.reggie.generator.entity.User;
import zhuxuanyu.reggie.generator.service.UserService;
import zhuxuanyu.reggie.generator.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author zhuxuanyu
* @description 针对表【user(用户信息)】的数据库操作Service实现
* @createDate 2023-02-16 10:16:51
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




