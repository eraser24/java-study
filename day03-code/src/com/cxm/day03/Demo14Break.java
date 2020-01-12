package com.cxm.day03;

/*
break关键字用法
1、可以用在switch语句当中，一旦执行，整个switch语句立刻结束
2、可以在循环语句当中，一旦执行，整个循环语句立刻结束，打断循环

关于循环的建议
凡是次数确定的场景多用for循环，否则用while循环。
 */
public class Demo14Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println("Hello " + i);
        }
    }
}
