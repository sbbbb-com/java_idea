package com.cn.Demo;

import java.util.Arrays;

public class 插入排序 {

    public static void main(String[] args) {
        int a[]={8,96,2,0,3,4,5,1,2,0,0,67,34,43,-1};
        method1(a);
        System.out.println(Arrays.toString(a));
    }

    private static void method1(int[] arr) {
        //排序从小到大
        //从零遍历所有的元素
        for (int i = 1; i < arr.length; i++) {
            //内层循环比较下一个元素与前面有序元素 如果不符合就插入
            for(int j=i;j>0;j--){
                //判断这个元素是否大于前面的元素，大于这说明有序，否则将其与前面的前面元素比较，直到最前面为止；
                if (arr[j]>arr[j-1]){
                    break;
                }else {
                    //交换这两个元素
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
