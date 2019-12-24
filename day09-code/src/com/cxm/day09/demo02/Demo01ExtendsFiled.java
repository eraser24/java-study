package com.cxm.day09.demo02;
/*
在父子类的继承关系当中，如果成员变量重名，访问方式有两种方法：
1、直接：通过子类对象访问成员变量
    等号左边是谁，就优先是谁，没有则向上找
2、间接：通过成员方法访问成员变量
    方法属于谁就优先用谁，没有则向上找
 */
public class Demo01ExtendsFiled {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu); //只能创建父类的东西，没有任何子类
        System.out.println("===========================");

        Zi zi  = new Zi(); //子类可以拥有父类的东西

        System.out.println(zi.numFu);
        System.out.println(zi.numZi);

        System.out.println("===========================");

        System.out.println(zi.num);
        System.out.println("==========================");

        //这个方法是子类的
        zi.methodZi();
        zi.methodFu();



    }
}
