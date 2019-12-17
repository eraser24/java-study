package com.cxm.day08.demo03;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.room = "101教室";

        Student one = new Student("郭靖",19);
        System.out.println("oew姓名：" + one.getName() + "，年龄：" + one.getAge() + "，one的教室" + Student.room);
        Student two = new Student("黄蓉",16);
        System.out.println("two姓名：" + two.getName() + "，年龄：" + two.getAge() + "，two的教室" + Student.room);


    }
}
