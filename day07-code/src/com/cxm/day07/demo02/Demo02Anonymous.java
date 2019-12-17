package com.cxm.day07.demo02;
/*
匿名对象作为方法的返回值和参数
 */

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = sc.nextInt();

        //匿名对象的方法
        int num1 =new Scanner(System.in).nextInt();
        System.out.println("输入的是：" + num1);

        //使用一般方法写入参数
//        Scanner sc = new Scanner();
//        methodParam();

        //使用匿名对象进行传参
//        methodParam(new Scanner(System.in));

        Scanner sc123 = methodReturn();
        int num111 = sc123.nextInt();
        System.out.println("输入是哈哈哈：" + num111);
    }
    public static void methodParam(Scanner sc1){
        int num123 = sc1.nextInt();
        System.out.println("输入的是：" + num123);
    }
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }

}
