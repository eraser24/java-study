package com.cxm.day04.demo03;
/*
题目要求：
定义方法，打印指定次数的HelloWorld
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(5);
    }
    /*
    三要素
    1、返回类型：只是进行打印，没有返回
    2、方法名称：printCount
    3、参数列表：int a
     */
     public static void printCount(int a ){
         for (int i = 0; i < a; i++) {
             System.out.println("Hello World" + (i + 1));
         }
     }
}
