package lib;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * xpath查询
 */
public class Jsoup入门_Element_xpath {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        //2.获取Document对象,根据xml文档获取
        //2.0获取student.xml的path
        String path = Jsoup入门_Element_xpath.class.getClassLoader().getResource("user.xml").getPath();
        //2.2解析xml文档，加载文档进内存，获取dom树-----》Document
        Document document = Jsoup.parse(new File(path), "utf-8");

        //3.创建Jxdocument对象
        JXDocument jxDocument = new JXDocument(document);

        //4.0结合xpath语法查询
        //4.1查询所有的student标签
//        List<JXNode> jxNodes = jxDocument.selN("//student");
//        for (JXNode jxNode:jxNodes
//             ) {
//           System.out.println(jxNode);
//        }

        //4.2查询所有student标签下的name标签
//        List<JXNode> jxNodes2 = jxDocument.selN("//student/name");
//        for (JXNode jxNode:jxNodes2
//        ) {
//            System.out.println(jxNode);
//        }
        //4.3查询student标签下带有id属性的name标签
//                List<JXNode> jxNodes2 = jxDocument.selN("//student/name[@kk]");
//        for (JXNode jxNode:jxNodes2
//        ) {
//            System.out.println(jxNode);
//        }
        //4.4查询student标签下带有id属性的name标签，并且id属性值为xx
        List<JXNode> jxNodes2 = jxDocument.selN("//student/name[@id='oo']");
        for (JXNode jxNode:jxNodes2) {
            System.out.println(jxNode);
        }

  }
}
