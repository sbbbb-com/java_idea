package com.cn.algorithm.sort;

public class Insertion {
    /**
     * 对数组a中的元素进行排序
     * @param a
     */
    public static void sort(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            //内层循环比较下一个元素与前面有序元素 如果不符合就插入
            for(int j=i;j>0;j--){
                //判断这个元素是否大于前面的元素，大于这说明有序，否则将其与前面的前面元素比较，直到最前面为止；
                if (greater(a[j],a[j-1])){
                    break;
                }else {
                    //交换这两个元素
                    exch(a,j,j-1);
                }
            }
        }
    }

    /**
     * 比较v元素是否大于w元素
     * @param v
     * @param w
     * @return
     */
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }

    /**
     * 交换元素的位置
     * @param a
     * @param i
     * @param j
     */
    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
