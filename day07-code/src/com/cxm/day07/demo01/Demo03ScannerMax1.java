package com.cxm.day07.demo01;

import java.util.Scanner;

/*
键盘输入三个字，然后求出其中的最大值
 */
public class Demo03ScannerMax1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = scanner.nextInt();
        System.out.println("请输入第三个数字");
        int num3 = scanner.nextInt();

        int tmp = num1 > num2 ? num1 :num2;
        int max = tmp > num3 ? tmp:num3;
        System.out.println("最大值是：" + max);
    }
}
