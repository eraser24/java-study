package com.cxm.day06.demo03;
/*
问题描述：无法阻止不合理的数值呗使用
解决方案：private关键字将需要保护的成员变量进行修饰
 */
public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "cxm";
//        person.age = 25;
        person.setAge(20);
        person.show();
    }
}
