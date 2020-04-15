package cn.itcast.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //��ȡ�û���
        String username = request.getParameter("username");

        //2.����service���ж��û����Ƿ����

        //������������Ӧ�ص����ݸ�ʽ   {"userExsit":true,"msg":"���û�̫�ܻ�ӭ�������һ��"};
        //                           {"userExsit":false,"msg":"�û�������"};

       // response.setContentType("text/html;charset=utf-8");

        //������Ӧ�����ݸ�ʽΪjson
        response.setContentType("application/json;charset=utf-8");
        Map<String,Object> map=new HashMap<String, Object>();
        if("tom".equals(username)){
            //����
            map.put("userExsit",true);
            map.put("msg","���û�̫�ܻ�ӭ�������һ��");
        }else {
            //������
            map.put("userExsit",false);
            map.put("msg","�û�������");
        }
        //��mapתΪjson�����Ҵ��ݸ��ͻ���
        //��mapתΪjson
        ObjectMapper mapper = new ObjectMapper();
        //���Ҵ��ݸ��ͻ���
        mapper.writeValue(response.getWriter(),map);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
