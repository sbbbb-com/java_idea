package com.cn.algorithm.sort;

public class Bubble {
    /**
     * 对数组a中的元素进行排序
     * @param a a是传进来的数组元素
     */
    public static void sort(Comparable[] a){
        for (int i=a.length-1;i>0;i--) {
            for (int j=0;j<i;j++){
                //比较索引j和索引j+1的值
                if (greater(a[j],a[i])){
                    exch(a,j,j+1);
                }
            }
        }
    }

    /**
     * 比较元素v是否大约元素w
     * @param v
     * @param w
     * @return  比较元素v是否大约元素w
     */
    private static boolean greater(Comparable v,Comparable w){
        return  v.compareTo(w)>0;
    }

    /**
     * 交换给的数组a中元素下标为i和j的值
     * @param a 传入数组a
     * @param i 传入元素i
     * @param j 传入元素j
     */
    private static void exch(Comparable[] a,int i,int j){
        //交换元素
        Comparable temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
