package com.cxm.day08.demo04;

import java.util.Scanner;

/*
反转键盘录入的字符串。

 */
public class Demo05Practise {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.next().toCharArray();

//        System.out.println("输入倒叙为：" + Math.);
        for (int length = chars.length - 1; length >= 0; length--) {
            System.out.print(chars[length]);
        }
    }
}
