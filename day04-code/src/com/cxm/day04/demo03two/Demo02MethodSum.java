package com.cxm.day04.demo03two;

import com.sun.xml.internal.bind.v2.runtime.output.FastInfosetStreamWriterOutput;

/*
定义一个方法：用来求出1-100的所有数字的和

分析
    1、返回值类型  int
    2、变量名   allSum
    3、参数   int a
 */
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是：" + allSum(3));
    }

    public static int allSum(int a) {
        int sum = 0;
        for (int i = a; i > 0; i--) {
            sum += i;
        }
        return sum;
    }
}
