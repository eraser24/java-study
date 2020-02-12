package com.cxm.day10.demo01;
/*
接口当中也可以定义“成员变量” 。但是必须使用public、static、final三个关键字进行修饰
从效果上看，这其实就是接口的【常亮】
格式：
public static final 数据类型 常量名称 = 数据值；

备注：一旦使用final关键字进行修饰，说明不可改变。

注意：
1、接口当中的常量，可以省略public、static、final。注意，不写照样是这样的，所以final不写也是final
2、接口当中的常量，必须进行赋值，不能不赋值。不能修改，默认是0 无意义，所以报错。
3、接口常量的名称，使用完全大写的字母，用下划线进行分割。（推荐命名规则）
 */
public interface MyInterfaceConst {
    public static final int NUM_OF_MY_CLASS = 10;
}
