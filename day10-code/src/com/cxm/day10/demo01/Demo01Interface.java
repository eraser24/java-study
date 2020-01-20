package com.cxm.day10.demo01;
/*
接口：
接口就是多个类的公共规范
接口是一种引用类型，最重要的内容是是：抽象方法

定义接口格式：
public interfa 接口名称{
    //接口内容
}

备注： .java  --> .class
换成关键字interface之后，编译成字节码文件仍然是 .class

如果是java7 接口中可以包含的内容有：
1、常量
2、抽象方法

如果java 8
3、默认方法
4、静态方法

如果java9
5、私有方法

接口使用步骤：
1、接口不能直接使用，必须有一个实现类来实现该接口，
格式：public class 实现类名称 implements 接口名称{
    //。。。。。。
}

2、接口的实现类，必须覆盖重写，接口中的抽象方法
实现：去掉abstract关键字，加上方法体大括号。

3、创建实现类的对象，进行使用

注意事项：如果实现类没有覆盖重写接口中所有的抽象方法，那么实现类自己就必须是抽象类。
 */
public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs();
        impl.methodAbs1();
    }
}
