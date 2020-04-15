package lib;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Jsoup入门 {
    public static void main(String[] args) throws IOException {
        //2.获取Document对象,根据xml文档获取
        //2.0获取student.xml的path
        String path = Jsoup入门.class.getClassLoader().getResource("user.xml").getPath();
        //2.2解析xml文档，加载文档进内存，获取dom树-----》Document
        Document document = Jsoup.parse(new File(path), "utf-8");
        //3.获取元素对象Element
        Elements elements = document.getElementsByTag("name");

        //打印长度
        System.out.println(elements.size());

        //3.获取第一个元素的对象
        Element element =elements.get(0);
        //3.0打印数据
        String name = element.text();
        System.out.println(name);
    }
}
