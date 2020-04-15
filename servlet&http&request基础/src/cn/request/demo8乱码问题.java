package cn.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/demo8")
public class demo8乱码问题 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //0.设置流的编码
        request.setCharacterEncoding("utf-8");
        //获取中文请求参数
        String username = request.getParameter("username");
        System.out.println(username);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //get请求参数
        //根据参数名称获取参数值
        String username = request.getParameter("username");
        System.out.println("get请求");
        System.out.println("打印username----"+username);
    }
}
