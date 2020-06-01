package cn.yiyiersanwu.dao.impl;

import cn.yiyiersanwu.dao.Jdbc;
import org.junit.Test;

import java.sql.*;


public class JdpcImpl implements Jdbc {
    //连接对象
    final String Url="jdbc:mysql://127.0.0.1:3306/test1?useSSL=false&serverTimezone=UTC";
    //用户名
    final String UserName="root";
    //密码
    final String PassWord="Taotie521!!";
    //获取数据库的连接对象
    Connection connection =null;
    //实例化Statement对象...
    Statement stmt =null;
    //接受返回结果
    ResultSet resultSet =null;


    @Test
    @Override
    public void findAll() throws ClassNotFoundException {

        try {
            //1.导入驱动jar包
            //2.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //3.获取数据库的连接对象
            connection = DriverManager.getConnection(Url, UserName, PassWord);
            //4.定义sql语句
            String Sql="select * from tab1";
            //5.获取执行sql语句的对象
            //5.1实例化Statement对象...
            stmt = connection.createStatement();
            //6.执行sql语句接受返回结果
            resultSet = stmt.executeQuery(Sql);
            //7.处理结果
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("value"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            //关闭资源
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if (stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if (resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

        return  ;
    }
}
