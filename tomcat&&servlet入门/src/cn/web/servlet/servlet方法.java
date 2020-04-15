package cn.web.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet
public class servlet方法 implements Servlet {

    /**
     * 初始化方法，在servlet在创建时被执行，只会执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("开始执行初始化方法init");
    }

    /**
     * 获取servletConfig对象
     * ServletConfig:Servlet的配置对象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /***
     * 提供服务的方法，每一个被访问时都被执行
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("正在执行service方法+++");
    }

    /**
     * 获取servlet的一些信息，版本，作者等等。
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 在服务器正常关闭时执行
     */
    @Override
    public void destroy() {
        System.out.println("服务器正常关闭---执行destroy方法");
    }
}
