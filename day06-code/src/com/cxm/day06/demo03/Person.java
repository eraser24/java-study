package com.cxm.day06.demo03;
/*
问题描述：无法阻止不合理的数值呗使用
解决方案：private关键字将需要保护的成员变量进行修饰

一旦使用private进行修饰，本类可以随意访问。
但是超出本类范围之外就不能直接访问了

间接访问private成员变量，就定义了一堆Getter/Setter方法

必须交setXXX或者getXxx
对应Getter不能有参数，返回值类型和成员变量对应
对应Setter来说，不能有返回值，参数类型和成员变量对应
 */
public class Person {
    String name;
    private int age;

    public void show(){
        System.out.println("我叫：" + name + ",年龄：" + age);
    }
//    这个成语方法，专门想age设置数据
    public void setAge(int num){
        if (num > 0 && num <200 ) {
            age = num;
        } else {
            System.out.println("数据不合理");
        }
//        age = num;
    }
    //这个成员方法，获取age。
    public int getAge(){
        return age;
    }
}
