package cn.itcast.web.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet( "/servletContextDemo5")
public class servletContextDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/**
 获取文件的真实（服务器）路径
        **/
            //2.通过HttpServlet获取
        ServletContext context = this.getServletContext();

        //获取文件的服务器路径
        String realPath = context.getRealPath("/b.txt"); //web目录下的资源访问
        System.out.println("b----"+realPath);
       // File file = new File(realPath);
        String c = context.getRealPath("/WEB-INF/c.txt");//WEB-INF目录下的资源访问
        System.out.println("c--"+c);

        String a=context.getRealPath("/WEB-INF/classes/a.txt"); //src目录下的资源访问
        System.out.println("a---"+a);




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
