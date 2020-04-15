package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo7 implements Filter {

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("777-----执行了");
        chain.doFilter(req, resp);
        System.out.println("777回来了了");
    }

    public void init(FilterConfig config) throws ServletException {

    }

    public void destroy() {
    }

}
