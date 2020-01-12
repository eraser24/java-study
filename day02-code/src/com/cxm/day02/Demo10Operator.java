package com.cxm.day02;

/*
三元运算符：

一元运算符：只需要一个数据就可以进行操作的运算符，例如：!  自++  自--
二元运算符：需要两个数据进行运算。例如：加法+ ，赋值=
三元运算符：需要三个数据才可以进行操作的运算符。

格式：
    数据类型 数据名称 = 条件判断 ? 表达式A： 表达式B；

流程：
首先判断条件是否成立：
    如果成立：将表达式A赋值给左侧变量
    如果不成立false：将表达式B赋值给；左侧变量

注意事项：
    1、必须同时保证表达式A和表达式B都符合左侧表达式的数据类型要求。
    2、三元运算符，的结果必须被使用。
 */
public class Demo10Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println(max);
        System.out.println(a > b ? a : b);

        int i = 1 == 2 ? 100 : 200;
        System.out.println(i);

    }
}
