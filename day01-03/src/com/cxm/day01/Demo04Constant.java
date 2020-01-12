package com.cxm.day01;
/*
常量：在程序运行期间，固定不变的量。

常量的分类
    1、字符串常量：凡是用字符串引起来的部分，叫做字符串常量。例如："123" "abc" "Hello"
    2、整数常量：直接写上的数字，没有小数点。例如：100,200,300
    3、浮点数常量：直接写上的数字，带有小数点。例如：2.5  4.6
    4、字符常量：凡事用单引号引起来的单个字符，就做字符常量。例如：'A' 'b'  '中'
    5、布尔常量：true、false
    6、空常量：null。

 */
public class Demo04Constant {
    public static void main(String[] args) {
        System.out.println("ABC");
        System.out.println("");
        System.out.println("================");
        System.out.println(100);
        System.out.println(500);
        System.out.println("================");

        //浮点数常量
        System.out.println(2.123);
        System.out.println(-1.23);
        System.out.println("================");

        //字符常量
        System.out.println('A');
        System.out.println('6');
//        System.out.println('');   //必须有且仅有一个字符
//        System.out.println('AB');  //必须有且仅有一个字符
        System.out.println("===========");


        //布尔常量
        System.out.println(true);
        System.out.println(false);
        System.out.println("===========");

        //空常量
//        System.out.println(null); //null 不能输出
    }
}
