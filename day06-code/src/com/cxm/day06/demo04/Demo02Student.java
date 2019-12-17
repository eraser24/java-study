package com.cxm.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("kobe",20);

        System.out.println("姓名：" + stu2.getName() +"年龄：" + stu2.getAge());
        //如果需要改变对象当中的成员变量内容，仍然需要使用getXxx

        stu2.setAge(21);
        System.out.println("姓名：" + stu2.getName() +"年龄：" + stu2.getAge());
    }
}
