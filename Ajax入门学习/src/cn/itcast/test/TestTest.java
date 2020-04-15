package cn.itcast.test;

import cn.itcast.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class TestTest {

    //java����תΪjson����
    @Test
    public void test1() throws Exception {
        //1.����Person����
        Person p = new Person();
        p.setAge(23);
        p.setName("����");
        p.setGender("��");

        //2.����Jackson�ĺ��Ķ���
        ObjectMapper mapper = new ObjectMapper();
        //3.���÷���ת��
        /**
         * ת��������
         *          writeValue(����1��obj����)
         *                       File����obj����ת��ΪJSON�ַ����������浽ָ�����ļ���
         * 	                     Writer����obj����ת��ΪJSON�ַ���������json������䵽�ַ��������
         * 	                     OutputStream����obj����ת��ΪJSON�ַ���������json������䵽�ֽ��������
         * 	        writeValueAsString(obj):������תΪjson�ַ���
        */
        String json = mapper.writeValueAsString(p);
       // System.out.println(json);

        //writeValue ������д��d��//a.txt�ļ���
        mapper.writeValue(new File("d://a.txt"),p);

        //writeValue�����ݹ�����writer��
        mapper.writeValue(new FileWriter("d://d.txt"),p);


    }

    @Test
    public  void test2() throws Exception{
        //1.����Person����
        Person p = new Person();
        p.setAge(23);
        p.setName("����");
        p.setGender("��");
        p.setBirthday(new Date());  //{"name":"����","age":23,"gender":"��","birthday":1584720748980}

        //2.ת��
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(p);

        System.out.println(json);
    }

    @Test
    public  void test3() throws Exception{
        //1.����Person����
        Person p = new Person();
        p.setAge(23);
        p.setName("����");
        p.setGender("��");
        p.setBirthday(new Date());

        Person p1 = new Person();
        p1.setAge(23);
        p1.setName("����");
        p1.setGender("��");
        p1.setBirthday(new Date());

        Person p2 = new Person();
        p2.setAge(23);
        p2.setName("����");
        p2.setGender("��");
        p2.setBirthday(new Date());

        //����list����
        List<Person> ps=new ArrayList<Person>();
        ps.add(p);
        ps.add(p1);
        ps.add(p2);

        //2.ת��
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(ps);

        //[{},{},{}]
        System.out.println(json);
    }

    @Test
    public  void test4() throws Exception {
        //����map����
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("name","����");
        map.put("age","��");
        map.put("gender","��");

        //ת��
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(map);

        System.out.println(json);
    }


    //��ʾjson����ת��Ϊjava����
    @Test
    public  void test5() throws Exception {
        //1.��ʼ��
        String  json="{\"gender\":\"��\",\"name\":\"����\",\"age\":23}";

        //2.����objectMapper����
        ObjectMapper mapper = new ObjectMapper();

        //3.ת��ΪJava���� person����
        Person person = mapper.readValue(json, Person.class);

        System.out.println(person);

    }



}