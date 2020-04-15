package cn.itcast.web.servlet;

import cn.itcast.domain.Province;
import cn.itcast.service.ProvinceService;
import cn.itcast.service.impl.ProvinceServiceImp;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/provinceServlet")
public class ProvinceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      /*  //1.����service��ѯ
        ProvinceService service=new ProvinceServiceImp();
        List<Province> list = service.findAll();

        //2.���л�listΪjson
        ObjectMapper mapper=new ObjectMapper();
        String json=mapper.writeValueAsString(list);*/

        //1.����service��ѯ
        ProvinceService service=new ProvinceServiceImp();
        String json = service.findAllJson();

        System.out.println(json);

        //3.��Ӧ���
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
