package com.cn.algorithm.test;

import com.cn.algorithm.sort.Student;

public class TestComparable {
    public static void main(String[] args) {
        //创建两个stude对象
        Student s1 = new Student();
        s1.setAge(18);
        s1.setUsername("小红");
        Student s2 = new Student();
        s1.setAge(14);
        s1.setUsername("小明");

        Comparable max=getMax(s1,s2);
        System.out.println(max);
    }

    public static Comparable getMax(Comparable c1,Comparable c2){
        int result = c1.compareTo(c2);
        //如果result小于零，c1<c2;
        //否则c1>c2
        if (result>=0){
            return c1;
        }else {
            return c2;
        }

    }
}
