package cn.yiyiersanwu.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/hhh/*")
public class MyFilter implements Filter {

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
        //用于拦截用户的一些请求，若与当前过滤器路径匹配，该方法就会调用
        PrintWriter out=resp.getWriter();
        out.write("hello myFilter");
    }

    //过滤器对象初始化的时候使用，配置一些参数
    public void init(FilterConfig config) throws ServletException {


    }

    public void destroy() {

    }

}
