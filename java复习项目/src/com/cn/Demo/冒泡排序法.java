package com.cn.Demo;

import java.util.Arrays;

public class 冒泡排序法 {
    public static void main(String[] args) {
        int a[]={8,96,2,0,3,4,5,1,2,0,0,67,34,43,-1};
        bubbeTest(a);

    }

    /**
     * 冒泡排序法并且打印结果
     * 从小到大排序
     * @param arr
     */
    public static void bubbeTest(int[] arr){
        //排序是从大到小排序
        for (int i = 1; i <arr.length-1; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i]>arr[j]){
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
