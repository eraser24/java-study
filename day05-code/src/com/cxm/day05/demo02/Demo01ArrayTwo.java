package com.cxm.day05.demo02;

public class Demo01ArrayTwo {
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

        int[] arrayB = new int[3];//动态初始化
        System.out.println(arrayB);
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//0
        System.out.println(arrayB[2]);//0
        System.out.println("=============");
        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB);
        System.out.println(arrayB[0]);//0
        System.out.println(arrayB[1]);//0
        System.out.println(arrayB[2]);//0


    }
}
