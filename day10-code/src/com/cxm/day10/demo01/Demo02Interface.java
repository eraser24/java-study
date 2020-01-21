package com.cxm.day10.demo01;
/*
1、接口的实现方法，可以通过接口实现类对象，直接调用
2、接口的默认方法，也可以被接口的实现类进行覆盖重写
3、
 */
public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();

        //调用默认方法，如果实现类没有，会向上找接口
        a.methodDefault();

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
