package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/demo4")
public class demo4输出流 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取字符输出流k
        response.setCharacterEncoding("UTF-8");
        //告诉浏览器，服务器使用的编码，建议其使用流的格式
        response.setHeader("content-type","text/html;charset=utf-8");

        PrintWriter pw = response.getWriter();
        //输出数据
        pw.write("hello word你好 hhh");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
