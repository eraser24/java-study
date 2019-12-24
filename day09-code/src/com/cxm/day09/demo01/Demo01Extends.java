package com.cxm.day09.demo01;
/*
Extends   继承（扩展）
在继承的关系中，“子类就是一个父类”。也就是说，子类可以当做父类来看
例如：父类是员工，子类是讲师，那么“讲师就是一个员工”。关系称为  is a

定义父类的格式：（一个普通的类定义）
public class 父类名称 {
    //......
}

定义子类格式：
public class 子类名称 extends 父类名称 {
    //.......
}
 */

public class Demo01Extends {
    public static void main(String[] args) {
        //窜国家一个子类对象
        Teacher teacher = new Teacher();
        //Teacher类当中继承了父类的内容
        teacher.method();

        //创建子类对象
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
