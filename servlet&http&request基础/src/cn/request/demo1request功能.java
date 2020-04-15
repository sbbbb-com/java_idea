package cn.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/demo_01")
public class demo1request功能 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /**
         * request功能演示
         */
        //1.获取请求方式：get
        String method = request.getMethod();
        System.out.println(".获取请求方式：get-----"+method);

        //2.获取虚拟目录 ：
        String contextPath = request.getContextPath();
        System.out.println("获取虚拟目录-----"+contextPath);

        //3.获取Servlet路径
        String servletPath = request.getServletPath();
        System.out.println("获取Servlet路径-----"+servletPath);

        //4.获取请求参数
        String queryString = request.getQueryString();
        System.out.println("获取请求参数-----"+queryString);

        //5.获取请求URI 和 URL
        String uri = request.getRequestURI();
        StringBuffer url = request.getRequestURL();
        System.out.println("获取请求URL--"+url+"\n"
                            +"获取请求URI----"+uri+"\n");

        //6.获取协议及版本信息
        String protocol = request.getProtocol();
        System.out.println("获取协议及版本信息--------"+protocol);

        //7.获取客户机的ip地址
        String addr = request.getRemoteAddr();
        System.out.println("获取客户机的ip地址--------"+addr);

    }
}
