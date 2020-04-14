package com.cn.algorithm.test;

import com.cn.algorithm.sort.Insertion;

import java.util.Arrays;

public class InsertionTest {
    public static void main(String[] args) {
        Integer a[]={15,0,5,3,-1};
        Insertion.sort(a);

        System.out.println(Arrays.toString(a));
    }
}
