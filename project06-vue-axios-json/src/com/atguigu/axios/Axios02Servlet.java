package com.atguigu.axios;

import com.atguigu.pojo.User;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * @title: Axios01Servlet
 * @Author 竹玄羽
 * @Date: 2022/10/7 21:53
 */
@WebServlet("/axios02.do")
public class Axios02Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuilder stringBuffer = new StringBuilder("");
        BufferedReader bufferedReader = request.getReader();
        String str = null;
        while ((str = bufferedReader.readLine()) != null) {
            stringBuffer.append(str);
        }

        str = stringBuffer.toString();

        //一直str需要转换成JavaObject格式
        //Gson两个API
        //1.fromJson(String,T),将json字符串转换成Object对象
        //2.toJson(object),将object对象转换成json字符串
        Gson gson = new Gson();
        User user = gson.fromJson(str, User.class);
        user.setUname("mike");
        user.setPwd("ok");

        //假设该user数据库查出来的，则转换成Json格式然后响应给客户端
        String userJson = gson.toJson(user);

        System.out.println(user);
        System.out.println(userJson);

        response.setCharacterEncoding("UTF-8");
        //MIME-TYPE
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(userJson);
    }
}
