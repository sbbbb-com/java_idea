package cn.itcast.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/sessiondemo4")
public class sessionDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1.获取session
        HttpSession session = request.getSession();

        System.out.println(session);
        //org.apache.catalina.session.StandardSessionFacade@5ecd50de
        //org.apache.catalina.session.StandardSessionFacade@16e312de



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
