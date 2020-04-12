package zhujie;


import java.lang.reflect.Method;

/**
 * 框架
 */

@Pro(className = "zhujie.Demo1",methodName = "show")
public class Demo2 {



    public static void main(String[] args)throws Exception {

        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<Demo2> dc2= Demo2.class;
        //2获取上边的注解对象
        Pro an = dc2.getAnnotation(Pro.class);
        //调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName=an.methodName();
//        System.out.println(className);
//        System.out.println(methodName);

        //加载类进内存
        Class cls=Class.forName(className);
        //创建对象
        Object obj=cls.newInstance();
        //获取方法对象
        Method method=cls.getMethod(methodName);
        //执行方法
        method.invoke(obj);




    }
}
