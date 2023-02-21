package servletstudy.servletchange;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @title: Demo3
 * @Author 竹玄羽
 * @Date: 2022/8/23 13:35
 */
public class Demo3 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Demo3");

        //重定向
        resp.sendRedirect("Demo4");
    }
}
