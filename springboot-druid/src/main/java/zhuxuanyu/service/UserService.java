package zhuxuanyu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import zhuxuanyu.pojo.User;

import java.util.List;

/**
* @author zhuxuanyu
* @description 针对表【t_user(用户)】的数据库操作Service
* @createDate 2023-01-15 20:00:40
*/
public interface UserService extends IService<User> {
   List<User> getAll();
}
