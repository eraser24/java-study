package com.cxm.day06.demo01;

public class Demo02Student {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.age);

        student.name = "kobe";
        student.age = 18;
        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println("================");

        student.eat();
        student.sleep();
        student.study();
    }
}
