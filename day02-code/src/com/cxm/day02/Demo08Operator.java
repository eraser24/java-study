package com.cxm.day02;

/*
比较运算符：
== 比较符号两边数据是否相等，相等结果是true。
< 比较符号左边的数据是否小于右边的数据，如果小于结果是true。
> 比较符号左边的数据是否大于右边的数据，如果大于结果是true。
<= 比较符号左边的数据是否小于或者等于右边的数据，如果小于结果是true。
>= 比较符号左边的数据是否大于或者等于右边的数据，如果小于结果是true。
!= 不等于符号 ，如果符号两边的数据不相等，结果是true。

注意事项：
    1、比较运算符，的结果是一个boolean值，成立true，不成立false
    2、如果进行多次判断，不能连着写，例如：  1 < x < 4(no)

 */
public class Demo08Operator {
    public static void main(String[] args) {

        System.out.println(1 == 1);//true
        System.out.println(1 < 2);//true
        System.out.println(3 > 4);//false
        System.out.println(3 <= 4);//true
        System.out.println(3 >= 4);//false
        System.out.println(3 != 4);//true
    }
}
