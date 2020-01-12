package com.cxm.day02;
/*
对应byte/short/char三种类型来说，如果没有超过范围
编译器会自动补上（byte） （short）（char）

1、如果没有超过范围，编译器强补
2、如果右侧超过了范围，直接报错
 */
public class Demo12Notice {
    public static void main(String[] args) {
        byte num1 = 30;
        System.out.println(num1);
//        byte num2 = 128;
    }
}
