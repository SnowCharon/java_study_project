package servletstudy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @title: ServletContext
 * @Author 竹玄羽
 * @Date: 2022/8/17 13:21
 * ServletContext演示
 */
public class ServletContext extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取对象
        javax.servlet.ServletContext servletContext = getServletContext();

        //2.常用方法
        //获取全局参数
        String globalDesc = servletContext.getInitParameter("globalDesc");
        System.out.println(globalDesc);

        //获取应用虚拟目录
        String contextPath = servletContext.getContextPath();
        System.out.println(contextPath);

        //根据虚拟目录获取绝对路径
        String realPath = servletContext.getRealPath("/");
        System.out.println(realPath);

        String b = servletContext.getRealPath("/b.txt");
        System.out.println(b);

        String c = servletContext.getRealPath("/WEB-INF/c.txt");
        System.out.println(c);

        String a = servletContext.getRealPath("/WEB-INF/classes/a.txt");
        System.out.println(a);

        //设置共享数据
        servletContext.setAttribute("username", "张三");

        //删除共享数据
        servletContext.removeAttribute("username");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
