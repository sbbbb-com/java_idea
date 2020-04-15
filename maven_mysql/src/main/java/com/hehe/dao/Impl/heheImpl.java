package com.hehe.dao.Impl;

import com.hehe.dao.heDao;
import com.hehe.domain.Itms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class heheImpl implements heDao {

    public List<Itms> findAll() throws Exception {
        List<Itms> list=new ArrayList<Itms>();
        //获取contection对象
        Connection connection =null;
        //获取真正操作数据库的对象
        PreparedStatement pst=null;
        //执行sql操作
        ResultSet rs =null;

        try {
            //加载驱动类
            Class.forName("com.mysql.jdbc.Driver");
            //获取contection对象
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day23","root","13666");

            //获取真正操作数据库的对象
            pst=connection.prepareCall("select  * from  province");
            //执行sql操作
            rs = pst.executeQuery();
            //把数据库结果集转成Java的list集合

            while (rs.next()){
                Itms itms=new Itms();
                itms.setId(rs.getInt("id"));
                itms.setName(rs.getString("NAME"));
                list.add(itms);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (connection!=null) connection.close();
            if (pst!=null) pst.close();
            if (rs!=null)rs.close();
        }
        return list;
    }
}
