package com.cxm.day10.demo01;
/*
接口当中也可以定义“成员变量” 。但是必须使用public、static、final三个关键字进行修饰
从效果上看，这其实就是接口的【常亮】
格式：
public static final 数据类型 常量名称 = 数据值；
 */
public interface MyInterfaceConst {
    public static final int num = 10;
}