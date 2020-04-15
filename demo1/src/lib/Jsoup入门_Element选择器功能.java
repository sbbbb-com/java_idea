package lib;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Jsoup入门_Element选择器功能 {
    public static void main(String[] args) throws IOException {
        //2.获取Document对象,根据xml文档获取
        //2.0获取student.xml的path
        String path = Jsoup入门_Element选择器功能.class.getClassLoader().getResource("user.xml").getPath();
        //2.2解析xml文档，加载文档进内存，获取dom树-----》Document
        Document document = Jsoup.parse(new File(path), "utf-8");

        //3.查询name标签
        /*
        div{
        }
         */
        Elements name = document.select("name");
       // System.out.println(name);

        //3.查询id值为xx的元素
        Elements com = document.select("xing");
       // System.out.println(com);

        //4.0 获取student标签并且xx属性值为xx
        Elements element2 = document.select("student[id=\"com\"]");
        //System.out.println(element2);
        //  4.0.1获取student标签并且xx属性值为xx的age子标签
        Elements element3 = document.select("student[id=\"com\"] > age");
        System.out.println(element3);
    }
}
