package com.atguigu.axios;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @title: Axios01Servlet
 * @Author 竹玄羽
 * @Date: 2022/10/7 21:53
 */
@WebServlet("/axios01.do")
public class Axios01Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");

        System.out.println("uname = " + uname);
        System.out.println("pwd = " + pwd);

        response.setCharacterEncoding("UTF-8");
        response.setContentType("test/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.write(uname + "___" + pwd);

        throw new NullPointerException("抛出一个异常！");
    }
}
