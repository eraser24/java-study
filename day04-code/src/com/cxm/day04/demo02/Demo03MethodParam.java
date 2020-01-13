package com.cxm.day04.demo02;
/*
有参数：小括号内   需要条件
无参数：小括号留空

例如：定义方法，打印10次hellword
*/
public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(2,4);
        method2();
    }
    //两个数字相乘
    public static void method1(int a ,int b){
        int result = a * b;
        System.out.println("结果是:" + result);
    }
    //打印10次
    public static void method2(){
        for (int i = 0; i < 11; i++) {
            System.out.println("Hello World" + i);
        }
    }

}
