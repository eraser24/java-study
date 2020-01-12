package com.cxm.day02;
/*
四则运算当中的加号，有3中用法
1、对数值来说是，加法
2、对字符char来说，在计算前，会提升为int，然后计算。
    char类型字符，和int类型之间对照ASCLL表 Unicode表
3、对应字符串String（不是关键字） 来说，加号代表字符串连接操作

任何数据类型和字符串连接的时候，都会变成字符串
 */
public class Demo05Plus {
    public static void main(String[] args) {
        String str1 = "aaaa";
        String str2 = "bbbb";
        System.out.println(str1 + str2);
        System.out.println("Hello" + "World" + "!!!");

        String str3 = "Java";
        System.out.println(str3 + 20);

        //优先级问题
        System.out.println( 20 + 10 + str2 + 20 + 30);
        System.out.println( 20 + 10 + str2 + (20 + 30));
        System.out.println( 20 + (10 + str2) + (20 + 30));
    }
}
