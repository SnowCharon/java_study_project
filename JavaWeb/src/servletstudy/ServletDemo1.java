package servletstudy;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @title: ServletDemo1
 * @Author 竹玄羽
 * @Date: 2022/8/16 18:11
 */
public class ServletDemo1 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("好耶！");
    }
}
