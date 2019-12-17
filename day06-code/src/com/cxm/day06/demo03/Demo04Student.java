package com.cxm.day06.demo03;

import com.cxm.day06.demo02.Student;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("科比");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是爷们：" + stu.isMale());
    }
}
