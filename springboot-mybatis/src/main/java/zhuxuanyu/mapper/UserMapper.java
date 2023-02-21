package zhuxuanyu.mapper;

import org.apache.ibatis.annotations.Mapper;
import zhuxuanyu.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author zhuxuanyu
* @description 针对表【t_user(用户)】的数据库操作Mapper
* @createDate 2023-01-15 20:00:40
* @Entity zhuxuanyu.pojo.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




