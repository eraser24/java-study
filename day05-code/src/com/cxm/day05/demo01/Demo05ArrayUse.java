package com.cxm.day05.demo01;
/*
动态初始化，有默认值：
整数：0
浮点数：0.0
字符类型：'\u0000'
布尔类型：false
引用类型为：null


注意事项：
静态初始化也有默认值，但是已经赋值了
 */
public class Demo05ArrayUse {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("======================");
        //将数据123赋值给arrayA 的1号
        arrayA[1] = 123;
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
    }
}
