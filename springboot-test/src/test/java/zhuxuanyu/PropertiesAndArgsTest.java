package zhuxuanyu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @title: PropertiesAndArgsTest
 * @Author 竹玄羽
 * @Date: 2023/1/22 9:52
 */
@SpringBootTest/*(properties = {"test.prop=testValue"})*/
public class PropertiesAndArgsTest {
    @Value("${test.prop}")
    private String msg;

    @Test
    void testProperties() {
        System.out.println(msg);
    }
}
