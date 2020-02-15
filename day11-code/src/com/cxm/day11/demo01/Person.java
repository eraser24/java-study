package com.cxm.day11.demo01;
/*
对于成员变量来说，如果final关键字修饰，那么变量也照样不变

1、由于成员变量具有默认值，所以用了final之后，必须手动赋值
2、对于final的成员变量，那么使用直接赋值，要么通过构造方法赋值，不会有默认值
3、必须保证类当中所有重载的方法，都会对final的成员变量进行赋值；
 */
public class Person {
    private final String name /*= "鹿晗"*/;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }
}
