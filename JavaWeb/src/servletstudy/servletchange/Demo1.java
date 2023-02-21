package servletstudy.servletchange;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @title: demo1
 * @Author 竹玄羽
 * @Date: 2022/8/23 12:52
 * 演示服务器内部转发及客户端重定向
 */
public class Demo1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Demo1");

        //服务器内部转发
        req.getRequestDispatcher("Demo2").forward(req, resp);
    }
}
