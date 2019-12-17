package com.cxm.day06.demo05;
/*
一个标准类：通常拥有下面4个组成部分
1、所有的成员变量都要使用private关键字修饰
2、为每个成员变量编写一对Getter/Setter方法
3、编写一个无参数的构造方法
4、编写一个有参数的构造方法

标准的类 也叫做java bean
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
