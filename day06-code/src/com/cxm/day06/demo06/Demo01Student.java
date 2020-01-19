package com.cxm.day06.demo06;

public class Demo01Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("迪丽热巴");
        student.setAge(20);
        System.out.println("name is " + student.getName() + ",age is " + student.getAge());

        Student student1 = new Student("古力娜扎",21);
        System.out.println("name is " + student1.getName() + ",age is " + student1.getAge());

    }


}
