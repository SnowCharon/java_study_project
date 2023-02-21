package com.atguigu.qqzone.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @title: LoginController
 * @Author 竹玄羽
 * @Date: 2022/11/28 9:59
 */

public class LoginController {
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取数据
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");

        //判断数据
        if (name.equals("admin") && pwd.equals("123456")) {
            //跳转页面
            response.sendRedirect("index.jsp");
        }
    }
}
