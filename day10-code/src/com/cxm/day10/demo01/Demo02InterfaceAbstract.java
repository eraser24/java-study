package com.cxm.day10.demo01;
/*
在任何版本的java中，接口都可以定义抽象方法
public abstract 返回值类型 方法名称（参数列表）；

注意事项：
1、接口当中的抽象方法，修饰符必须是两个固定的关键字。publi abstract
2、这两个关键字可以选择性省略
3、

 */
public interface Demo02InterfaceAbstract {
    //这是一个抽象方法
    public abstract void methodAbs();

    abstract void methodAbs1();

    public void methodAbs2();

    void methodAbs3();
}
