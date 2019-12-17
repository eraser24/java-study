package com.cxm.day05.demo04;

public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 50};
        printArray(array);
    }
    /*
    三要素：
    返回值类型：打印
    方法名称：printArray
    参数列表：数组   int[] array
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
