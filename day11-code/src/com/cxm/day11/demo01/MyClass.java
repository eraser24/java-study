package com.cxm.day11.demo01;
/*
当final关键字来修饰一个类的时候   格式：
public final class 类名称{
    //。。。。。。
}

含义：当前这个类不能有任何子类集成。（太监类）

注意：一个类如果是final，所有的成员方法无法覆盖重写
 */
public final class MyClass {
    public void method(){
        System.out.println("方法执行");
    }
}
