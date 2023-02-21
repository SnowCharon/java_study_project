package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @title: MyServletContextListener
 * @Author 竹玄羽
 * @Date: 2022/9/1 17:24
 */
//@WebListener()
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Servlet上下文对象初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("Servlet上下文对象销毁");
    }
}
