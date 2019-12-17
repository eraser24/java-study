package com.cxm.day07.demo01;
/*
键盘输入三个字，然后求出其中的最大值

思路：
1、键盘输入Scanner
    导包、创建、使用
2、调用3次
3、对比
4、转换步骤
    4.1 先判断前两个
    4.2 钱两个的最大值和第三个对比
5、打印最终结果
 */

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个值:");
        int num1 = sc.nextInt();
        System.out.print("请输入第二个值:");
        int num2 = sc.nextInt();
        System.out.print("请输入第三个值:");
        int num3 = sc.nextInt();

        int tmp = num1 > num2 ? num1 :num2;
        int max = tmp > num3 ? tmp :num3 ;
        System.out.println("三个数里最大值为：" + max);

    }
}
