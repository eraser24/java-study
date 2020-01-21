package com.cxm.day10.demo01;
/*
注意：
1、不能通过接口实现累的对象来调用接口当中的静态方法。

正确用法：
通过接口名称，直接调用其中的静态方法。

格式：
接口名称。静态方法名（参数）

 */
public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStatic impl = new MyInterfaceImpl();
        MyInterfaceStatic.methodStatic();
    }
}
