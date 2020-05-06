package cn.test;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
class Person {
    private String name;
    private int age;
    //getter与setter省略
    //无参构造方法
    public Person() {
    }
}

public class Test {
//    请按照以下要求设计一个程序,使用BeanUtils工具为Person对象赋值:
//    要求如下:
//            (1)直接生成Person对象
//            (2)使用BeanUtils工具为name属性赋值”youjun”,age赋值为31。
//            (3)使用BeanUtils工具取出属性值,并在控制台输出。
//
//    作业提交要求：
//    代码截图；
//    输出结果截图。



   public void test(){
        Person person=new Person();
       try {
           BeanUtils.setProperty(person,"name","youjun");
           System.out.println(BeanUtils.getProperty(person,"name"));
       } catch (IllegalAccessException e) {
           e.printStackTrace();
       } catch (InvocationTargetException e) {
           e.printStackTrace();
       } catch (NoSuchMethodException e) {
           e.printStackTrace();
       }

   }

}
