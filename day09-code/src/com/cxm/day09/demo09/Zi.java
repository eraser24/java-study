package com.cxm.day09.demo09;

/*
super关键字用来访问父类内容，this关键字用来访问子类内容
1、在本类的成员方法中，访问本类的成员变量
2、在本类的成员方法中，访问本类的另一个成员方法
3、在本类的构造方法中，访问本类的构造方法
    a、在第三种用法当中注意：this（。。。）必须是构造方法的第一个语句。
    b、super和this两种构造调用，不能同时使用
 */
public class Zi extends Fu {
    int num = 20;

    public Zi(){
        this(123);//本类无参数调用有参数。
    }
    public Zi(int n){

    }

    public void showNum() {
        int num = 10;
        System.out.println(num); //局部变量
        System.out.println(this.num);//本类中的成员变量
        System.out.println(super.num); //父类方法的成员变量
    }

    public void methondA() {
        System.out.println("aaaaa");
    }

    public void methondB() {
        this.methondA();

        System.out.println("bbbbb");

    }
}
