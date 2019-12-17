package com.cxm.day05.demo03;
/*
数组必须先new
如果赋值null，没有new创建
会发生：空指针异常  NullPointerException


 */
public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] array = null;
        array = new int[3];
        System.out.println(array[0]);
    }
}
