package com.cxm.day03;

/*
三种循环的区别。
1、如果条件判断从来没有满足过，for  whil循环会执行0次，但是do-while会执行一次
2、for循环的变量在小括号当中定义，只有循环内才可以使用。while和do-while本来就在外边，出来之后可以继续使用
3、
 */
public class Demo13LoopDifference {
    public static void main(String[] args) {
        for (int i = 1; i < 0; i++) {
            System.out.println("Hello");
        }
        System.out.println("===========");
        int i = 1;
        while (i < 0) {
            System.out.println("Hello");
        }

        System.out.println("=============");
        int i1 = 1;
        do {
            System.out.println("Hello");
            i++;
        } while (i1 < 0);
    }
}
