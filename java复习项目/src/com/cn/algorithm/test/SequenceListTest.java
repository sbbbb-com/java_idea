package com.cn.algorithm.test;

import com.cn.algorithm.linear.SequenceList;

class SequenceListTest1 {

    public static void main(String[] args) {

        //创建顺序表对象
        SequenceList<String> sl = new SequenceList<String>(10);
        //测试插入
        sl.insert("大狗");
        sl.insert("二毛");
        sl.insert(1,"二尔");
        //测试获取
        String getResult=sl.get(1);
        System.out.println("获取到的第一个元素是"+getResult);
        //测试删除
        String remove=sl.remove(0);
        System.out.println("删除的元素是"+remove);
        //测试清空
        sl.clear();
        System.out.println("清空后的线性表的元素的个数是"+sl.length());
    }
}
