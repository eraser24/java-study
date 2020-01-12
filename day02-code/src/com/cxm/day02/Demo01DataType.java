package com.cxm.day02;
/*
数据类型转换：
当数据类型不一样的时候，将会发生数据类型转换；

自动类型转换（隐式）
    1、特点：代码不需要进行特殊处理，自动完成。
    2、规则：数据范围从小到大。
强制类型转换（显式）
 */

public class Demo01DataType {
    public static void main(String[] args) {
        System.out.println(1024); //整数，默认是int类型
        System.out.println(3.1); //浮点数，默认是double

        //左边是long类型，右边是int类型，左右不一样
        //一个等号代表赋值，右侧的int常量，交给long变量进行存储
        //int --》 long，符合从小到大的要求
        //这一行代码，发生了自动类型转换
        long num1 = 100;
        System.out.println(num1);


//        float---》double
        double num2 = 2.5F;
        System.out.println(num2);

        //long ---> float。float范围更大，符合
        float num3 = 30L;
        System.out.println(num3);
    }
}
