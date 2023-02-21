package servletstudy;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @title: ServletInit
 * @Author 竹玄羽
 * @Date: 2022/8/29 8:00
 */
@WebServlet(urlPatterns = {"/try"},
        initParams = {
                @WebInitParam(name = "hello", value = "world"),
                @WebInitParam(name = "username", value = "mike")
        }
)
public class ServletInit extends HttpServlet {
    @Override
    public void init() throws ServletException {
        ServletConfig servletConfig = getServletConfig();
        String parameter = servletConfig.getInitParameter("hello");
        System.out.println("initValue=" + parameter);
    }
}
