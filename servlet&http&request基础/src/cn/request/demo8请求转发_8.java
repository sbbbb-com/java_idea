package cn.request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo_8")
public class demo8请求转发_8 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo888888888888888被访问了");

    //请求转发  转发demo9
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/demo请求转发_9");
//        requestDispatcher.forward(request,response);

        //存储数据到request域中
        request.setAttribute("msg","hello");

        request.getRequestDispatcher("/demo_9").forward(request,response);
        //注意后面的是路径

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request,response);
           }
}
