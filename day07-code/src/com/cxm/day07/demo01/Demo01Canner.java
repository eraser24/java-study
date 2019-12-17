package com.cxm.day07.demo01;

import java.util.Scanner;

/*
Scanner类的功能，可以实现键盘输入数据，到程序当中

引用类型的一般使用步骤：
    1、导包
        import 包路径.类名称
        只有java.long包下的包不需要导包
    2、创建
        类名称 对象名 = new 类名称（参数）；
    3、使用
        对象名.成员方法名（参数）

获取键盘输入的一个int数字：int num = sc.nextInt();
获取键盘输入的字符串：String str = sc.next();
 */
public class Demo01Canner {
    public static void main(String[] args) {
//        String str = "123123";
        //备注：System.in代表从键盘输入
        Scanner sc = new Scanner(System.in);

        //获取键盘输入的int数字
        int num = sc.nextInt();
        System.out.println("输入的int数字是：" + num);

        //字符串
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);

    }
}
