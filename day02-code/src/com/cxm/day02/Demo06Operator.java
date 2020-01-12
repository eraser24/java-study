package com.cxm.day02;
/*
自增自减操作符
自增运算符：++
自减运算符：--

含义：让一个变量涨一个数字1，或者让一个变量降数字1

使用格式：写在变量名称前，或者变量名称之后，例如++num ,num++

使用方式：
    1、单独使用：独立成为一个步骤
    2、混合使用：和其他操作混，例如和赋值或者打印混合使用，

使用区别：
    1、在单独使用的时候，前++ 和后++ 没有任何区别，也就是++num和num++。是完全一样的
    2、混合使用的时候，有【重大区别】
        a、如果前++，立刻+1，然后拿着结果进行使用 【先加后用】
        b、如果是后++，先用本来数值，然后再+1.    【先用后加】

注意事项：
    只有变量才能使用自增自减操作，常量不能使用自增自减操作。

 */
public class Demo06Operator {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);

        //单独使用
        ++num1;
        System.out.println(num1);

        num1++;
        System.out.println(num1);
        System.out.println("================");

        int num2 = 20;
        System.out.println(++num2);
        System.out.println(num2);

        System.out.println("==============");
        int num3 = 30;
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println("==============");

        int x = 10;
        int y = 20;
        int result3 = ++x + y--;
        System.out.println(result3); //31
        System.out.println(x); //11
        System.out.println(y); //19
    }
}
