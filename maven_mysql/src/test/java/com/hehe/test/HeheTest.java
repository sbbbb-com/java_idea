package com.hehe.test;
import com.hehe.dao.*;

import com.hehe.dao.Impl.heheImpl;
import com.hehe.domain.Itms;
import org.junit.Test;

import java.util.List;

public class HeheTest {

    @Test
    public  void  findAll() throws Exception {
        heDao hh=new heheImpl();
        List<Itms> all = hh.findAll();
        System.out.println(all);
    }
}
