package com.cxm.day01;
/*
变量：程序运行期间，内容可以发生改变的量。

创建一个变量，并且使用的格式：
数据类型 变量名称；  //创建了一个变量
变量名称 = 数据值； //赋值，将右边的数据值，赋值交给左边的变量。

一步到位的格式：
数据类型 变量名称 = 数据值； //在创建变量的同时，立刻放入指定的数据值
 */
public class Demo06Variable {
    public static void main(String[] args) {
        //创建变量
        //格式：数据类型 变量名称；
        int num1;
        //向变量名称存入一个数据
        num1 = 100;
        //代印变量
        System.out.println(num1);

        //改变变量当中的本来数据，变成新的数字
        num1 = 20;
        System.out.println(num1);

        //使用一步到位的格式定义变量
        //格式：数据类型 变量名称 = 数据值；
        int num2 = 200;
        System.out.println(num2);  //200
        System.out.println("=================");


        //byte类型
        byte num3 = 30; //不能超过范围
        System.out.println(num3);

        short num5 = 50;
        System.out.println(num5);

        long num6 = 30000000000L;
        System.out.println(num6);

        float num7 = 2.5F;
        System.out.println(num7);

        double num8 = 1.2;
        System.out.println(num8);

        char zifu1 = 'A';
        System.out.println(zifu1);

        zifu1 = '中';
        System.out.println(zifu1);

        boolean var1 = true;
        System.out.println(var1);

        var1 = false;
        System.out.println(var1);



        //将一个变量的数据内容，赋值交给另一个变量
        boolean var2 = var1;
        System.out.println(var2);
    }
}
