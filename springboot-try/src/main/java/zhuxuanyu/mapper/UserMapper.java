package zhuxuanyu.mapper;
import org.apache.ibatis.annotations.Param;

import zhuxuanyu.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author zhuxuanyu
* @description 针对表【t_user(用户)】的数据库操作Mapper
* @createDate 2023-01-15 19:37:43
* @Entity zhuxuanyu.pojo.User
*/
public interface UserMapper extends BaseMapper<User> {
    int insertSelective(User user);

    int deleteById(@Param("id") Integer id);
}




