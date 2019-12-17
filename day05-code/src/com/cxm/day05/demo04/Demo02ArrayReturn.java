package com.cxm.day05.demo04;
/*
一个方法有0,1多个参数，但是只能0,1个返回值，不能有多个返回值

使用数组可以多返回

数组作为参数，返回值，都是地址值
 */
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10, 20,30);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
    public static int[]  calculate(int a , int b ,int c ) {
        int sum = a + b + c ;
        int avg = sum / 3;
        int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;
        return array;
    }
}
