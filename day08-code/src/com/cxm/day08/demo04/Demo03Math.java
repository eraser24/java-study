package com.cxm.day08.demo04;
/*
Math静态工具类
java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

public static double abs(double num)：获取绝对值。有多种重载。
public static double ceil(double num)：向上取整。
public static double floor(double num)：向下取整。
public static long round(double num)：四舍五入。

Math.PI代表近似的圆周率常量（double）。
 */
public class Demo03Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.24));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-123));
        System.out.println("=================");

        //向上取整
        System.out.println(Math.ceil(3.123));
        System.out.println(Math.ceil(-3.1234));
        System.out.println("=================");

        //向下取整
        System.out.println(Math.floor(3.9999));
        System.out.println(Math.floor(-3.999));
        System.out.println("================");

        //四舍五入
        System.out.println(Math.round(10.5));
        System.out.println(Math.round(10.4));

        //π
        System.out.println(Math.PI);
    }
}

