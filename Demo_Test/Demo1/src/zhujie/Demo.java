package zhujie;

import org.junit.Test;

@SuppressWarnings("all")
public class Demo {


    @Deprecated
    public void demo1() {
        System.out.println("测试");
    }

    @Test
    public void demo2(){

    }

@MyAnno(strs = "d")
    public void demo3(){
        demo1();
    }

}
