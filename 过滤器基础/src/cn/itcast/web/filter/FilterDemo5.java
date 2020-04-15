package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//浏览器直接请求该资源时，该过滤器会被执行，转发的话，不会。
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.FORWARD)
//@WebFilter(value = "/index.jsp",dispatcherTypes ={DispatcherType.FORWARD,DispatcherType.REQUEST} )  //浏览器直接发送请求或者转发访问index时都会执行过滤器
public class FilterDemo5 implements Filter {

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("demo5.......");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

    public void destroy() {
    }

}
