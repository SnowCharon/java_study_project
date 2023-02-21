package com.atguigu.book.controller;

import com.atguigu.book.pojo.Cart;
import com.atguigu.book.pojo.User;
import com.atguigu.book.service.CartItemService;
import com.atguigu.book.service.UserService;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class UserController {

    private UserService userService;
    private CartItemService cartItemService;

    public String login(String uname, String pwd, HttpSession session) {
        User user = userService.login(uname, pwd);
        if (user != null) {
            System.out.println(user);
            Cart cart = cartItemService.getCart(user);
            user.setCart(cart);
            session.setAttribute("currUser", user);
            return "redirect:book.do";
        }
        return "user/login";
    }

    public String regist(String uname, String pwd, String email, String verifyCode, HttpSession session, HttpServletResponse response) throws IOException {
        Object kaptchaCodeKey = session.getAttribute("KAPTCHA_SESSION_KEY");

        //如果验证码和输入的验证码不一致则依然返回注册页面
        if (!verifyCode.equals(kaptchaCodeKey)) {
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
            PrintWriter writer = response.getWriter();
            writer.println("<script language='javascript'>alert('验证码错误!');window.location.href='page.do?operate=page&page=user/regist';</script>");
            return null;
        }

        userService.regist(new User(uname, pwd, email));
        return "user/login";
    }

    public String checkUname(String uname) {
        User user = userService.getUser(uname);
        if (user != null) {
            //该用户名已经被占用，不可以注册
            System.out.println("该用户名已经被占用！");
            return "json:{'uname':'1'}";
            //return "ajax:1";
        } else {
            return "json:{'uname':'0'}";
            //return "ajax:0";
        }
    }
}

