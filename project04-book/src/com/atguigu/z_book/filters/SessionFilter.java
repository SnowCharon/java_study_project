package com.atguigu.z_book.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @title: SessionFilter
 * @Author 竹玄羽
 * @Date: 2022/9/28 14:21
 */

/*@WebFilter(urlPatterns = {"*.do", "*.html"},
        initParams = {
                @WebInitParam(name = "login", value = "/book/page.do?operate=page&page=user/login,/book/user.do?null")
        })
 */
public class SessionFilter implements Filter {
    List<String> loginList = null;

    @Override
    public void init(FilterConfig config) throws ServletException {
        String login = config.getInitParameter("login");
        String[] loginArr = login.split(",");
        loginList = Arrays.asList(loginArr);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        //http://localhost:8080/book/page.do?operate=page&page=user/login
        System.out.println("request.getRequestURI = " + request.getRequestURI());
        System.out.println("request.getQueryString = " + request.getQueryString());

        String uri = request.getRequestURI();
        String queryString = request.getQueryString();
        String str = uri + "?" + queryString;
        if (loginList.contains(str)) {
            filterChain.doFilter(request, response);
            return;
        } else {
            HttpSession session = request.getSession();
            Object currUserObject = session.getAttribute("currUser");
            if (currUserObject == null) {
                response.sendRedirect("page.do?operate=page&page=user/login");
            } else {
                filterChain.doFilter(request, response);
            }
        }
    }

    @Override
    public void destroy() {

    }
}
