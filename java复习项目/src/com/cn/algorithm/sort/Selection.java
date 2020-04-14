package com.cn.algorithm.sort;

public class Selection {
    /**
     * 对数组a中的元素进行排序
     * @param a
     */
    public static  void sort(Comparable[] a){

        //选择排序法
        for (int i = 0; i<=a.length-2 ; i++) {
            //定义一个变量，记录最小元素的索引，默认为参与排序的第一个元素的所在位置
            int minIndex=i;
            for (int j = i+1; j <a.length; j++) {
                //比较最小索引index处的值和j索引处的值；
                if (greater(a[minIndex],a[j])){
                    minIndex=j;
                }
            }
            //交换最小元素所在索引minindex处的值；
            exch(a,i,minIndex);
        }
    }

    /**
     *
     * @param v
     * @param w
     * @return 返回值是v是否大于w的布尔值
     */
    private static boolean greater(Comparable v,Comparable w){

        return v.compareTo(w)>0;
    }

    /**
     * 对数组中元素进行交换
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
