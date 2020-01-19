package com.cxm.day07.demo01;

import java.util.Scanner;

/*
键盘输入两个int数字，并求出和

思路：
    1、键盘输入Scanner
    2、Scanner三个步骤，导包，使用
    3、需要的是，两个数字，所以要调用两次netInt方法
    4、两个字加在一起，
    5、结果打印
 */
public class Demo02ScannerSum1 {
    public static void main(String[] args) {
        System.out.println("请输入两个数字");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("两个数字的和是" + (num1+ num2));

    }
}
