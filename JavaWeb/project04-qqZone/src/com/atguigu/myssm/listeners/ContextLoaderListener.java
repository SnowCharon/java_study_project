package com.atguigu.myssm.listeners;

import com.atguigu.myssm.ioc.BeanFactory;
import com.atguigu.myssm.ioc.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @title: ContextLoadListener
 * @Author 竹玄羽
 * @Date: 2022/9/1 18:34
 * 监听上下文启动，在上下文启动的时候，创建IOC容器，然后将其保存在application作用域，
 * 中央控制器再从application作用域获取容器
 */
@WebListener
public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //1.获取上下文对象
        ServletContext application = servletContextEvent.getServletContext();
        //2.从上下文获取初始化的参数（IOC容器创建文件）
        String path = application.getInitParameter("contextConfigLocation");
        //3.创建IOC容器
        BeanFactory beanFactory = new ClassPathXmlApplicationContext(path);
        //4.将IOC保存到application作用域
        application.setAttribute("beanFactory", beanFactory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
