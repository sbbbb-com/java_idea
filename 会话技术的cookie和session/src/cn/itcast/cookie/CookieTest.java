package cn.itcast.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * cookie的快速入门
 */
@WebServlet("/cookieTest")
public class CookieTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应消息体的数据格式以及编码
        response.setContentType("text/html;charset=utf-8");

        //1.获取所有的cookie
        Cookie[] cookies = request.getCookies();
        boolean flag=false; //没有cookie为lastTime

        //2.遍历cookie数组
        if (cookies!=null && cookies.length>0){
            for (Cookie cookie :
                    cookies) {
                //获取cookie的名称
                String name=cookie.getName();
                //判断名称是否是lastTime
                if ("lastTime".equals(name)){
                    //有该Cookie,不是第一次访问

                    flag=true;//有lastTime的cookie

                    //设置cookie的value
                    //获取当前时间的字符串，重新设置cookie的值，重新发送cookie
                    Date date=new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日-HH:mm:ss");
                    String str_date = sdf.format(date);

                    System.out.println("编码前数据--"+str_date);
                    //URL编码
                    str_date= URLEncoder.encode(str_date,"utf-8");
                    System.out.println("编码后数据--"+str_date);

                    cookie.setValue(str_date);
                    //设置cookie的存活时间
                    cookie.setMaxAge(3600*24*30);
                    response.addCookie(cookie);
                    //响应数据
                    String value = cookie.getValue();

                    //URL解码:
                    System.out.println("解码前数据--"+value);
                    //URL解码
                    value= URLDecoder.decode(value,"utf-8");
                    System.out.println("解码后数据--"+value);

                    response.getWriter().write("欢迎回来,你上次访问时间是-"+value);

                    break;
                }
            }
        }

       if (cookies==null || cookies.length==0 || flag==false){
        //没有，第一次访问cookie
           //设置cookie的value
           //获取当前时间的字符串，重新设置cookie的值，重新发送cookie
           Date date=new Date();
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日-HH:mm:ss");
           String str_date = sdf.format(date);

           System.out.println("编码前数据--"+str_date);
           //URL编码
           str_date= URLEncoder.encode(str_date,"utf-8");
           System.out.println("编码后数据--"+str_date);

           Cookie cookie = new Cookie("lastTime",str_date);
           cookie.setValue(str_date);
           //设置cookie的存活时间
           cookie.setMaxAge(3600*24*30);
           response.addCookie(cookie);

           response.getWriter().write("你好,欢迎你首次访问");
       }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
