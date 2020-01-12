package com.cxm.day03;

/*
使用三元运算符和if实现最大值
 */
public class Demo06Max {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = a > b ? a : b;
        System.out.println("最大值是" + max);

        int max1;
        if (a > b){
            max1 = a ;
        }else {
            max1 = b;
        }
        System.out.println(max1);
    }
}
