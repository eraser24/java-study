package com.cxm.day07.demo01;
/*
键盘输入两个int数字，并求出和

思路：
    1、键盘输入Scanner
    2、Scanner三个步骤，导包，使用
    3、需要的是，两个数字，所以要调用两次netInt方法
    4、两个字加在一起，
    5、结果打印
 */

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
    }
}
