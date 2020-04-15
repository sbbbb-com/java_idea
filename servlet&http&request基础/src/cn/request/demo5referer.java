package cn.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo_05")
public class demo5referer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //演示获取referer

        String referer = request.getHeader("referer");
        System.out.println("来源是"+ referer);
        if (referer.contains("/Demo")){
            //正常访问
            System.out.println("打开学习资料");
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("正常访问中");
        }else {
            //盗链
            System.out.println("你好请访问资源首页昂！");
        }

    }
}
