package lib;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Jsoup入门_2 {
    public static void main(String[] args) throws IOException {
        //2.获取Document对象,根据xml文档获取
        //2.0获取student.xml的path
        String path = Jsoup入门_2.class.getClassLoader().getResource("user.xml").getPath();
        //2.2解析xml文档，加载文档进内存，获取dom树-----》Document
        Document document = Jsoup.parse(new File(path), "utf-8");
       // System.out.println(document);
        /**
       String str= "<?xml version='1.0' encoding='UTF-8'?>\n" +
                "\n" +
                "<users>\n" +
                "    <user>\n" +
                "        <name>zhangsan</name>\n" +
                "        <age>13</age>\n" +
                "        <gender>male</gender>\n" +
                "    </user>\n" +
                "\n" +
                "    <user>\n" +
                "        <name>lisi</name>\n" +
                "        <age>25</age>\n" +
                "        <gender>female</gender>\n" +
                "    </user>\n" +
                "</users>";
        Document document1 = Jsoup.parse(str);
        System.out.println(document1);
         **/
        //3.parse(URL url,int timeoutMillis): 通过网络路径获取指定的html或xml的文档对象
        URL url = new URL("https://baike.baidu.com/");
        Document parse = Jsoup.parse(url, 10000);
        System.out.println(parse);
    }
}
