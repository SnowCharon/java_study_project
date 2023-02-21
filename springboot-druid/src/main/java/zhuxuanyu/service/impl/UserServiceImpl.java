package zhuxuanyu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhuxuanyu.mapper.UserMapper;
import zhuxuanyu.pojo.User;
import zhuxuanyu.service.UserService;

import java.util.List;

/**
 * @author zhuxuanyu
 * @description 针对表【t_user(用户)】的数据库操作Service实现
 * @createDate 2023-01-15 20:00:40
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.isNotNull(StringUtils.isNotBlank("id"), "id")
                .eq("password","123456");
        return userMapper.selectList(wrapper);
    }
}




