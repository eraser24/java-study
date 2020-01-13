package com.cxm.day04.demo03two;

/*
定义方法，打印指定次数的HelloWorld


分析；
    1、返回值类型   void
    2、方法名称     print
    3、方法参数     int a
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
        print(10);
    }

    public static void print(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("HelloWorld!" + i);
        }
    }
}
