package com.cxm.day02;
/*
运算符：进行特定操作的符号，例如 +
表达式：用运算符连起来的式子叫表达式。例如 20 + 5   、 a + b

四则运算：
加：+
减：-
乘：*
除：/
取模（取余数） ：%

首先计算，然后打印

注意事项：
    1、运算当中如果有不同数据类型的数据。结果是范围大的那种
 */
public class Demo04Operator {
    public static void main(String[] args) {
        System.out.println(20 + 30 );

        //变量
        int a = 20;
        int b = 5;
        System.out.println(a - b);

        //变量 和常量
        System.out.println(a * 10);

        //除法
        System.out.println(a / 3);
        System.out.println(a % 3);

        double result3 = a + 2.5;
        System.out.println(result3);
    }
}
