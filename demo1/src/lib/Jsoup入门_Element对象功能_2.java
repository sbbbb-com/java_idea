package lib;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Jsoup入门_Element对象功能_2 {
    public static void main(String[] args) throws IOException {
        //2.获取Document对象,根据xml文档获取
        //2.0获取student.xml的path
        String path = Jsoup入门_Element对象功能_2.class.getClassLoader().getResource("user.xml").getPath();
        //2.2解析xml文档，加载文档进内存，获取dom树-----》Document
        Document document = Jsoup.parse(new File(path), "utf-8");

        //通过document对象获取name标签，获取所有的name标签
        Elements name = document.getElementsByTag("name");
        //System.out.println(name.size());

        //通过element对象获取子标签
        Element students = document.getElementsByTag("student").get(0);
        Elements id = students.getElementsByTag("name");
        //System.out.println(id.size());

        //获取student对象的属性值
        String attr = id.attr("kk");
        //System.out.println(attr);

        //获取文本内容
        String html = id.html();
        String text = id.text();
        System.out.println("html  "+html);
        System.out.println("text  "+text);




    }
}
