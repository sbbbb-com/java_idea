package cn.yiyiersanwu.filter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListent implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("我是一个监听器，包的位置还放错的监听器");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
