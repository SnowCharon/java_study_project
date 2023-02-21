package servletstudy;

import javax.servlet.*;
import java.io.IOException;

/**
 * @title: ServletStudy
 * @Author 竹玄羽
 * @Date: 2022/8/16 12:38
 */
public class ServletStudy implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 所有的客户端请求都会通过service方法
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
