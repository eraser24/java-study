package com.cxm.day07.demo03;
/*
Random类，用来生成随机数字
    1、导包
    2、创建
        Random r = new Random  //可以没有参数
    3、使用
        获取一个随机int数：int num = r.nextInt
        获取一个随机int数字；参数代表了范围，左闭右开区间
            int num = r.nextInt(3) //代表的含义是[0,3) 0~2
         */

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是：" + num);
    }
}
