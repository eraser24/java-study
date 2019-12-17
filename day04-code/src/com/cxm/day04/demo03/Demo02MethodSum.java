package com.cxm.day04.demo03;
/*
题目要求：
定义一个方法：用来求出1-100的所有数字的和
 */
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是" + getSum());
    }
    /*
    三要素
    1、返回值：有返回值 int
    2、方法名称：getSum
    3、参数列表：范围确定，无参数
     */
    public static int getSum(){
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i ;
        }
        return sum;
    }
}
