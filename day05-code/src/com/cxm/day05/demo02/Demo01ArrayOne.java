package com.cxm.day05.demo02;

public class Demo01ArrayOne {
    public static void main(String[] args) {
        int[] array = new int[3];//动态初始化
        System.out.println(array);
        System.out.println(array[0]);//0
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0
        System.out.println("=============");
        array[1] = 10;
        array[2] = 20;
        System.out.println(array);
        System.out.println(array[0]);//0
        System.out.println(array[1]);//0
        System.out.println(array[2]);//0


    }
}
