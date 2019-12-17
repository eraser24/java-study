package com.cxm.day06.demo03;
/*
面向对象三大特征：封装，继承，多态

封装性:将一些细节信息隐藏起来，对应外界不可见
    1、方法就是一种封装
    2、关键字private也是一种封装

 */
public class Demo02Methond {
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 100};
        int max = getMax(array);
        System.out.println("数组中的最大数为" + max);

    }
    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
