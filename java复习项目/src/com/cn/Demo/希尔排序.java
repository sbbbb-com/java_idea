package com.cn.Demo;

import java.util.Arrays;

public class 希尔排序 {

    public static void main(String[] args) {
        int arr[]={8,9,1,7,2,3,5,4,6,0};
        System.out.println("未排序"+Arrays.toString(arr));
        method(arr);
        System.out.println("排序的"+Arrays.toString(arr));

    }

    /*
    交换法
     */
    private static void method(int[] arr) {
        int temp=0;
        int count=0;
        for (int gap=arr.length/2;gap>0;gap/=2){
            for (int i=gap;i<arr.length;i++){
                //内循环中 gap组 遍历各组中的所有元素 每一组有 元素  步长为gap
                for (int j =i-gap; j >=0 ; j-=gap) {
                    //如果当前元素大于加上步长后的那个元素，说明需要交换
                    if (arr[j]>arr[j+gap]){
                        temp=arr[j];
                        arr[j]=arr[j+gap];
                        arr[j+gap]=temp;
                    }
                }
            }
            System.out.println("第"+(++count)+"轮"+Arrays.toString(arr));
        }

/*       //分析过程
         int temp=0;
        //希尔排序的第一轮排序
        //第一轮排序是10个数据分成五组
        for (int i=5;i<arr.length;i++){
            //内循环中 遍历各组中的所有元素 每一组有两个元素  步长为5
              for (int j =i-5; j >=0 ; j-=5) {
                //如果当前元素大于加上步长后的那个元素，说明需要交换
                if (arr[j]>arr[j+5]){
                    temp=arr[j];
                    arr[j]=arr[j+5];
                    arr[j+5]=temp;
                }
            }
        }
        System.out.println("第一轮"+Arrays.toString(arr));

        //希尔排序的第二轮排序
        //第二轮排序是10个数据分成五/2 两组
        for (int i=2;i<arr.length;i++){
            //内循环中 遍历各组中的所有元素 每一组有两个元素  步长为5
            for (int j =i-2; j >=0 ; j-=2) {
                //如果当前元素大于加上步长后的那个元素，说明需要交换
                if (arr[j]>arr[j+2]){
                    temp=arr[j];
                    arr[j]=arr[j+2];
                    arr[j+2]=temp;
                }
            }
        }
        System.out.println("第二轮"+Arrays.toString(arr));

        //希尔排序的第三轮排序
        //第三轮排序是10个数据分成2/2 1组
        for (int i=1;i<arr.length;i++){
            //内循环中 遍历各组中的所有元素 每一组有两个元素  步长为5
            for (int j =i-1; j >=0 ; j-=1) {
                //如果当前元素大于加上步长后的那个元素，说明需要交换
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("第三轮"+Arrays.toString(arr));*/
    }
}
