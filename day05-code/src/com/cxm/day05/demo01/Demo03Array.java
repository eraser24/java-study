package com.cxm.day05.demo01;
/*
注意：
1、静态会自动推算长度
2、静态初始化两个步奏
2、动态初始化拆分两个步骤
4、静态省略不能拆分

使用建议：
确定具体内容用静态，没确定内容用动态
 */
public class Demo03Array {
    public static void main(String[] args) {
        int[] arrayA = { 10, 20, 30 };
        //两个步骤
        int[] arrayB;
        arrayB = new int[] {11,21,31};

        int[] arrayC;
        arrayC = new int[5];

//        int[] arrayD;
//        arrayD = {10,20,30};




    }
}
