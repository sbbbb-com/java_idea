package com.lanqiao;

import java.util.Arrays;
import java.util.Scanner;

/*
问题描述
　　给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
输入格式
　　第一行为一个整数n。
　　第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
输出格式
　　输出一行，按从小到大的顺序输出排序后的数列。
样例输入
5
8 3 6 4 9
样例输出
3 4 6 8 9
 */
public class Test2 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        int arr[]=new int[i];

        while (i>0){
            arr[i-1]=scanner.nextInt();
            i--;
        }

        kuaiShu(arr,0,arr.length-1);
        for (int s :arr ) {
            System.out.printf(s+" ");
        }


    }
    /*第一行为一个整数n。
    　第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。*/
    //快速排序法
    private static void kuaiShu(int[] arr, int zuo,int you){
        //下标合理性检验
        if (zuo>you){
            return;
        }
        //寄存关键数据
        int begin=zuo;
        int end=you;
        int temp=arr[zuo];

        while (begin<end){
            while (begin<end && arr[end]>=temp){
                end--;
            }
            while (begin<end && arr[begin]<=temp){
                begin++;
            }
            if (begin<end){
                exch(arr,begin,end);
            }
        }
        //先把标杆归位
        arr[zuo]=arr[begin];
        arr[begin]=temp;

        //进行递归
        kuaiShu(arr, zuo,begin-1);
        kuaiShu(arr,begin+1,you);

    }

    //交换数组数字
    private static void exch(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
