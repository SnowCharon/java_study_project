package servletstudy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @title: ServletDemo4
 * @Author 竹玄羽
 * @Date: 2022/8/16 22:37
 * 线程安全问题--------------Servlet线程不安全
 * 解决Servlet线程不安全-----1.把变量改为局部变量
 * 2.同步--加锁
 */
public class ServletDemo4 extends HttpServlet {
    /**
     * 1.定义用户成员变量
     * 方法一
     */
    private String username;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       String username = null;

        synchronized (this) {
            //2.获取用户名
            username = req.getParameter("username");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //3.将用户名响应给浏览器
            PrintWriter printWriter = resp.getWriter();
            printWriter.println("Welcome" + username);
            printWriter.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
