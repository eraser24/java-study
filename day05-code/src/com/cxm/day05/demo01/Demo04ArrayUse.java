package com.cxm.day05.demo01;
/*
直接打印数组名称，得到的是：内存地址哈希值

访问数组元素的格式：数组名称[索引值]
索引值：为元素编号，从0开始-1为止
 */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        int[] arrayA = { 10, 20, 30 };
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("==================");
        System.out.println(arrayA[1]);
        System.out.println("==================");


        int num = arrayA[1];
        System.out.println(num);
    }
}
