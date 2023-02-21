package zhuxuanyu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zhuxuanyu.mapper.UserMapper;
import zhuxuanyu.pojo.User;
import zhuxuanyu.service.UserService;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    void selectTest(){
        List<User> list = userService.getAll();
        list.forEach(System.out::println);
    }

}
