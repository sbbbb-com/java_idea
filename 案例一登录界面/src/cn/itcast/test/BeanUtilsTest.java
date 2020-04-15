package cn.itcast.test;

import cn.itcast.domain.User;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import javax.servlet.annotation.WebServlet;
import java.lang.reflect.InvocationTargetException;

public class BeanUtilsTest {

    @Test
    public void test(){
        User user=new User();

        try {
            BeanUtils.setProperty(user,"username","lishi");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(user);

    }
}
