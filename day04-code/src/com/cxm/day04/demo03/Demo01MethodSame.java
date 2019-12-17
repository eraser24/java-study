package com.cxm.day04.demo03;
/*
题目要求：
定义一个方法，用来判断两个数字是否相同
 */
public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame(10,10));
    }
    /*
    三要素：
    1、返回值类型：boolean
    2、方法名称：isSame
    3、参数列表：int a int b
     */
    public static boolean isSame(int a , int b){
        //判断
 /*       if (a == b){
            same = true;
        } else {
            same = false;
        }*/
        //三元运算
//        same = a == b ? true : false;

//        boolean same = a == b;
        return a == b;
    }
}
