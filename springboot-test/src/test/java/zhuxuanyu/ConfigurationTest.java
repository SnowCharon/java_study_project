package zhuxuanyu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import zhuxuanyu.config.MsgConfig;

/**
 * @title: ConfigurationTest
 * @Author 竹玄羽
 * @Date: 2023/1/23 15:27
 */
@SpringBootTest
//@Import(MsgConfig.class)
public class ConfigurationTest {
    @Autowired
    private String msg;
    @Test
    void testMsg(){
        System.out.println(msg);
    }
}
