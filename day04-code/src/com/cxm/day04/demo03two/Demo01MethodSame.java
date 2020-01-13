package com.cxm.day04.demo03two;

/*
题目要求：
定义一个方法，用来判断两个数字是否相同

方法三要素：
    1、返回值类型
    2、方法名称
    3、方法参数
 */
public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10, 10));
        System.out.println(isSame(10, 11));
    }

    public static boolean isSame(int a, int b) {
        return a == b;
    }
}
