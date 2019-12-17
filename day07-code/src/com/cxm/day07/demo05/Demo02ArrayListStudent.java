package com.cxm.day07.demo05;
/*
题目：
    自定义4个学生对象，添加到集合，并遍历

思路：
    1、自定义学生类   四个部分：private  无参构造  全参构造  get/set
    2、创建集合，学生对象   <Student>
    3、根据类,创建4个学生对象
    4、add
    5、遍历
 */

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("洪七公",20);
        Student two = new Student("欧阳峰",21);
        Student three = new Student("黄药师",22);
        Student four = new Student("断之星",23);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        System.out.println(list);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "，年龄" + stu.getAge() );
        }
    }
}
