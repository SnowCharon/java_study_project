package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @title: Demo1Servlet
 * @Author 竹玄羽
 * @Date: 2022/8/31 11:44
 */
@WebServlet("/demo03.do")
public class Demo03Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Demo03Servlet.....");
        req.getRequestDispatcher("succ.html").forward(req, resp);
    }
}
