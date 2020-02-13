package com.cxm.day10.demo03;
/*
这个子接口当中有几个方法？ 答：4个
methodA  接口A
methodB  接口B
methodCommon  同时来源接口A和B
method 来源自己
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB {
    public abstract void method();


    @Override
    default void methodDefault() {
        System.out.println("");
    }
}
