package com.cxm.day04.demo02;
/*
题目：定义一个方法，{求}和
题目：定义一个方法，{打印}和


 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(1 ,3);
        System.out.println("返回结果是" + num);
        System.out.println("================");
        printSum(100,200);
        System.out.println("================");
        System.out.println(getSum(2,3));
        System.out.println("================");
        //对应void没有返回值的方法，只能单独调用，不能打印和赋值调用
//        System.out.println(printSum(2,3));
//        int num2 = printSum(10,20);

    }
    public static int getSum(int a , int b){
        int result = a +b;
        return result;
    }
    //两个数据相加
    //没有返回值，自己打印输出
    public static void printSum(int a , int b){
        int result = a + b;
        System.out.println("结果是" + result);
    }
}
