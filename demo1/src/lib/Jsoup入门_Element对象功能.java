package lib;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Jsoup入门_Element对象功能 {
    public static void main(String[] args) throws IOException {
        //2.获取Document对象,根据xml文档获取
        //2.0获取student.xml的path
        String path = Jsoup入门_Element对象功能.class.getClassLoader().getResource("user.xml").getPath();
        //2.2解析xml文档，加载文档进内存，获取dom树-----》Document
        Document document = Jsoup.parse(new File(path), "utf-8");

        //3.获取元素对象，
        //3.1获取所有的student对象
        Elements elements = document.getElementsByTag("student");
       // System.out.println(elements);
       // System.out.println("----------------------------");

        //3.2获取属性名id的元素对象们
        Elements elements1 = document.getElementsByAttribute("id");
       // System.out.println(elements1);

        //3.2获取number属性值为001的元素对象
        Elements elements2 = document.getElementsByAttributeValue("id", "com");
      //  System.out.println(elements2);

        Element cn = document.getElementById("cn");
        System.out.println(cn);
    }
}
