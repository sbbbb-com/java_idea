package com.cn.algorithm.sort;

public class Quick {
    /*
    比较v元素是否小于w元素
     */
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }

    //数组i和j交换位置
    private static void exch(Comparable[] a,int i,int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    //对数组内的元素进行排序
    public static void sort(Comparable[] a){

    }

    //对数组a中从索引lo到索引hi之间的元素进行排序
    private static void sort(Comparable[] a,int lo,int hi){

    }

    //对数组a中，从索引lo到索引之间的元素进行分组，并返回分组界限对应的索引
    public static int partition(Comparable[] a,int lo,int hi){
        return -1;
    }
}
