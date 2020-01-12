package com.cxm.day02;
/*
逻辑运算符
与（并且） &&   全部是true，才是true，否则false
或（或者） ||    只要有至少一个是true，全都是false，才是false
非（取反）  ！    本来是true，变成false。

短路
与&&，或||,具有短路效果，如果左边已经可以判断得到最终结果，那么右边不再执行，节省性能

注意事项：
    1、逻辑运算符只能用于boolean值。
    2、与、或，需要左右各有一个boolean值，但是取反只要有唯一一个boolean值即可。
    3、与，或 两种运算符，如果有多个条件，可以连续写
        两个   a && b
        多个   a && b && c
TIPS:
    对应  1< x < 3 的情况
    1 < x && x < 3
 */
public class Demo09Logic {
    public static void main(String[] args) {
        System.out.println(true && false);
        System.out.println(3 < 4 && 10 > 5);
        System.out.println("==========");

        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println("=================");

        System.out.println(!true);
        System.out.println(!false);

        System.out.println("===============");
        int a = 10 ;
        System.out.println(3 > 4 && ++a < 100);
        System.out.println(a);

        System.out.println("==========");
        int b = 20;
        System.out.println(3 < 4 || ++b < 100);
        System.out.println(b);
    }
}
