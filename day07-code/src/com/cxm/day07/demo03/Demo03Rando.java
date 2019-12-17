package com.cxm.day07.demo03;
/*
Random练习题：
题目要求：
    根据一个int变量n的值，来获取随机数字，范围是[1,n] ，可以取到1，可以取到n

思路：
1、定义一个int变量n，随意赋值
2、使用Random:导包，创建，使用
3、如果写10   那么就是0-9，然而想要  1-10
 */

import java.util.Random;

public class Demo03Rando {
    public static void main(String[] args) {
        int num1 = 5;
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(num1) +1 ; //本来范围是0-9   需要整体加一变成1-10
            System.out.println(num);
        }
    }
}
