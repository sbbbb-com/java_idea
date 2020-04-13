package com.cn.algorithm.test;

import com.cn.algorithm.sort.Bubble;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr={4,8,0,3,9,5,5};
        Bubble.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
