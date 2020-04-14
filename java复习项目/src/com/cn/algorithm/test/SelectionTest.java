package com.cn.algorithm.test;

import com.cn.algorithm.sort.Selection;

import java.util.Arrays;

public class SelectionTest {

    public static void main(String[] args) {
        //测试类
        Integer []a={1,8,5,2,0,6,-9,5,-7,1};
        Selection.sort(a);
        System.out.printf(Arrays.toString(a));
    }
}
