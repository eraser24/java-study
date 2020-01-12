package com.cxm.day03;

/*
流程控制-判断语句-if
1、单if语句
格式：
if (){
    语句体
}
 */
public class Demo02If {
    public static void main(String[] args) {
        System.out.println("天气不错，网吧");
        int age = 19;
        if (age >= 18) {
            System.out.println("进入，high");
            System.out.println("骂街");
            System.out.println("结账走人");
        }
        System.out.println("回家吃饭");
    }
}
