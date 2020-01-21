package com.cxm.day10.demo01;
/*
问题描述：
我们需要抽取一个公共方法，用来解决两个默认方法之间重复代码的问题。
但是这个共有方法，不应该让实现类使用，应该是私有化的，

解决方案：
从java9 中，接口当中允许定义私有方法
1、普通私有方法，解决多个默认方法之间重复代码问题。
2、静态私有方法，解决多个静态方法之间重复代码问题。
 */
public interface MyInterfacePrivateA {
    public default void methodDefault1() {
    }

    public default void methodDefault2() {
        System.out.println("默认方法2");
    }

    public default void methodCommon() {
        System.out.println("默认方法1");
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
