package zhuxuanyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import zhuxuanyu.pojo.User;
import zhuxuanyu.service.UserService;
import zhuxuanyu.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author zhuxuanyu
* @description 针对表【t_user(用户)】的数据库操作Service实现
* @createDate 2023-01-15 19:37:43
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




