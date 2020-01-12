package com.cxm.day03;

/*
循环语句-for

循环结构的基本组成部分，一般可以分为四个部分

1、初始化语句：在循环开始最初执行，而且只做唯一一次
2、条件判断：如果成立，则循环继续，如果不成立，循环退出
3、循环体：重复做的事情，若干语句
4、步进表达式：每次循环之后要进行的扫尾工作

 */
public class Demo09For {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("我错了" + i);
        }

    }
}
