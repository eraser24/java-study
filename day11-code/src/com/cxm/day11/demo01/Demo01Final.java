package com.cxm.day11.demo01;

/*
final 关键字代表最总不可改变的

常见的四种用法：
1、可以用来修饰一个类
2、可以用来修饰一个方法
3、可以用来修饰一个局部变量
4、可以用来修饰一个成员变量
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);
        System.out.println("===========");

        //一旦使用final用来修饰局部变量，这个变量不能进行改变
        //"一次赋值，终身不变"
        final int num2 = 200;

//        num2 = 250;  //错误写法不能改变

        //正确写法，只要保证有唯一一次赋值即可
        final int num3;
        num3 = 30;

        //对于基本类型来说，不可变说的是当中的数据不可改变
        //对于引用类型来说，不可变说的是变量当中的地址值不可改变

        Student stu1 = new Student("赵丽颖");
        System.out.println(stu1.getName());
        System.out.println(stu1);
        stu1 = new Student("霍建华");
        System.out.println(stu1.getName());
        System.out.println(stu1);
        System.out.println("============");

        final Student stu2 = new Student("高圆圆");
//        stu2 = new Student("赵又廷");   //错误写法，地址不可变
        stu2.setName("圆又圆");
        System.out.println(stu2.getName());

    }
}
