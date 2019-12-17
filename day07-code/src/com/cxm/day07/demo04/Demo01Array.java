package com.cxm.day07.demo04;
/*
对象数组
题目：
定义一个数组，用来存储3个Person对象

数组有个缺点，长度不变
 */

public class Demo01Array {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面存放Person类型的对象
        Person[] array = new Person[3];

//        System.out.println(array[0]);
        Person one = new Person("迪丽热巴", 20);
        Person two = new Person("古力娜扎",28);
        Person three = new Person("玛尔扎哈", 38);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[1].getName());

//        System.out.println(array[0].getAge()); //
    }
}
