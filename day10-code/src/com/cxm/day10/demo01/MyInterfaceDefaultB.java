package com.cxm.day10.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault {

    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B，覆盖重写了，接口的默认方法");
    }
}
