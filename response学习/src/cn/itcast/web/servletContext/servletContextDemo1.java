package cn.itcast.web.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/servletContextDemo1")
public class servletContextDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/**
        servletContext的对象的获取
        1.通过request对象获取
            request.getServletContext();
        2.通过HttpServlet获取
            this.getServlet获取
        **/
        //1.通过request对象获取
        ServletContext context1 = request.getServletContext();
        //2.通过HttpServlet获取
        ServletContext context2 = this.getServletContext();
        System.out.println(context1.equals(context2));
        System.out.println(context1==context2);
        System.out.println("1--- "+context1);
        System.out.println("1--- "+context2);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
