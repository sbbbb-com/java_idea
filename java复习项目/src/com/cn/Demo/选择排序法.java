package com.cn.Demo;

import java.util.Arrays;

public class 选择排序法 {

    public static void main(String[] args) {

        int arr[]={1,8,0,0,5,3,5,7,2,1,82,4};
        int a[]={8,96,2,0,3,4,5,1,2,0,0,67,34,43,-1};
        method(a);
        冒泡排序法.bubbeTest(a);
    }

    /**
     * 选择排序法
     * @param arr
     */
    private static void method(int[] arr) {
        //从小打大排序
        //外层循环依次遍历所有的值，从零到数字的倒数第二个元素，也就是arr.length-2  记得是小于等于
        for (int i = 0; i <=arr.length-2 ; i++) {
            //定义最小值元素的下标，默认为第一个元素，然后与后面的元素进行对比，如果比他小，就交换他们的下标
            int minIndex=i;
            //每一次内层循环的开始，j的下表都必须是i+1
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex]>arr[j]){
                    minIndex=j;
                    //交换完下表后遍历完成后什么找到最小的值，所以需要把寄存的下表与i代表的值进行交换
                }
            }
            //把寄存的下表minIndex与i代表的值进行交换
            exch(arr,i,minIndex);
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 交换数组中的元素
     * @param a
     * @param i
     * @param j
     */
    private static void exch(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}
