package com.cxm.day09.demo07;
/*
集成关系中，父子累的构造方法访问特点
1、子类构造方法当中，有默认隐含的 super（）调用，什么不写先调用父类
2、可以通过super关键字，来子类构造调用父类，重载构造
3、super的父类构造调用，必须是子类构造方法的第一个语句，不能一个子类构造调用多次super构造
总结：
    子类必须调用父类构造方法，不写则赠送super（），只能有一个super调用，并且必须是第一个
 */
public class Demo01Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();

    }
}
