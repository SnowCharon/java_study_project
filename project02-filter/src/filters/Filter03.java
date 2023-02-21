package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @title: Demo1Filter
 * @Author 竹玄羽
 * @Date: 2022/8/31 11:49
 */
//@WebFilter("/demo01.do")
@WebFilter("*.do")
public class Filter03 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("Filter初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("C");
        //放行
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("C2");
    }

    @Override
    public void destroy() {
//        System.out.println("Filter被销毁");
    }
}
