package cn.yiyiersanwu.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter("*")
public class Testfilter implements Filter {

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        resp.getWriter().write("Before Hello");



        chain.doFilter(req, resp);
        resp.getWriter().write("After Hello");

    }
    public void init(FilterConfig config) throws ServletException {

    }

    public void destroy() {
    }

}
