package servletstudy;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @title: ServletConfigStudy
 * @Author 竹玄羽
 * @Date: 2022/8/17 11:27
 */
public class ServletConfigStudy extends HttpServlet {
    /**
     * 1.声明ServletConfig
     */
    private ServletConfig config;

    /**
     * 通过init方法，对ServletConfig进行赋值
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //3.ServletConfig常用方法
        //根据key获取value
        String encodingValue = config.getInitParameter("encoding");
        System.out.println(encodingValue);

        //获取所有的key
        Enumeration<String> keys = config.getInitParameterNames();
        while (keys.hasMoreElements()) {
            //获取每个key
            String key = keys.nextElement();
            //根据key获取到value
            String value = config.getInitParameter(key);
            System.out.println(key + "," + value);
        }

        //获取Servlet名称
        String servletName = config.getServletName();
        System.out.println(servletName);

        //获取servletContext
        ServletContext servletContext = (ServletContext) config.getServletContext();
        System.out.println(servletContext);

        //获取共享数据
        Object value = ((javax.servlet.ServletContext) servletContext).getAttribute("username");
        System.out.println(value);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
