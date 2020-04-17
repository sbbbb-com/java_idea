package com.lanqiao;

import java.util.Scanner;

/**
 * 输出一行，包含一个实数，四舍五入保留小数点后7位，表示圆的面积
 * 样例输出
 * 50.2654825
 */
public class Test1 {

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        //获取半径
        double k2=k.nextDouble();
        //获取面积
        k2= (k2*k2*(Math.PI));
        System.out.printf("%2.7f",k2);
    }
}
