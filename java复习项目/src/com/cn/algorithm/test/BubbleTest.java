package com.cn.algorithm.test;

import com.cn.algorithm.sort.Bubble;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr=
       {1,8,0,0,5,3,5,7,2,1,82,4};
        Bubble.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
