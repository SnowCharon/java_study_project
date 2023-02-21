package com.atguigu.cookies.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @title: KaptchaDome1
 * @Author 竹玄羽
 * @Date: 2022/10/3 20:43
 */
@WebServlet("/kaptcha01")
public class KaptchaDome1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Object object = session.getAttribute("KAPTCHA_SESSION_KEY");
        System.out.println("object = " + object);
    }
}
