package com.cxm.day04.demo04;
/*
题目要求：
比较两个数据是否相等
参数类型：两个byte类型，两个short,两个int，两个long，并在main方法测试
 */
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        short a = 10;
        short b = 20;
        System.out.println(isSame(a ,b));
        System.out.println(isSame((short) 10,(short) 10));

    }
    public static boolean isSame(byte a , byte b){
        System.out.println("byte");
        boolean same;
        if (a == b){
            same = true;
        } else {
            same = false;
        }
        return same;
    }
    public static boolean isSame(short a , short b) {
        System.out.println("short");
        boolean same = a == b ? true : false;
        return same;
    }
    public static boolean isSame(int a ,int b){
        System.out.println("log");
        return a == b;
    }
    public static boolean isSame(long a ,long b){
        System.out.println("long");
        if (a == b){
            return true;
        } else {
            return false;
        }
    }
}
