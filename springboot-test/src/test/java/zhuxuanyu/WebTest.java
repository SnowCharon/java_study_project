package zhuxuanyu;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

/**
 * @title: WebTest
 * @Author 竹玄羽
 * @Date: 2023/1/23 15:34
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@AutoConfigureMockMvc
public class WebTest {
    @Test
    void testWeb(@Autowired MockMvc mockMvc) throws Exception {
        //创建虚拟请求
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/book");
        //执行对应请求
        ResultActions actions = mockMvc.perform(builder);
    }

    @Test
    void testStatus(@Autowired MockMvc mockMvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/book");
        ResultActions action= mockMvc.perform(builder);

        //设定预期值
        //定义本次调用的预期值
        StatusResultMatchers status = MockMvcResultMatchers.status();
        //预计本次调用成功，状态码为：200
        ResultMatcher ok = status.isOk();
        //添加预期值到本次调用过程中并进行匹配
        action.andExpect(ok);
    }

    @Test
    void testBody(@Autowired MockMvc mockMvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/book");
        ResultActions action= mockMvc.perform(builder);

        //设定预期值
        //定义本次调用的预期值
        ContentResultMatchers content = MockMvcResultMatchers.content();
        //预计本次调用结果
        ResultMatcher string = content.string("springboot");
        //添加预期值到本次调用过程中并进行匹配
        action.andExpect(string);
    }
}
