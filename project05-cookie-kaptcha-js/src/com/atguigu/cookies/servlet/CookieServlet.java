package com.atguigu.cookies.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @title: CookieServlet
 * @Author 竹玄羽
 * @Date: 2022/10/2 22:18
 */

@WebServlet("/cookie01")
public class CookieServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建cookie
        Cookie cookie = new Cookie("uname", "mike");

        //将cookie对象保存到浏览器端
        response.addCookie(cookie);

        request.getRequestDispatcher("hello.html").forward(request, response);
    }
}
