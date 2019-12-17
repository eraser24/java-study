package com.cxm.day04.demo03;

import java.sql.SQLOutput;

/*
注意事项：
1、方法应该在类中，不能在方法中定义方法，
2、方法定义前后顺序无所谓
3、方法定义之后不会执行，如果希望执行，需要调用单独调用，打印调用，赋值调用
4、如果方法有返回值，必须写return
5、return后面的返回值类型，必须和方法的返回值类型对照一致
6、对void没有返回值的方法，不能写return，只能写return自己
7、对应方法当中最后一行return
8、多return 只有一个能执行到
 */
public class Demo04MethodNotice {
    public static void main(String[] args) {
        System.out.println(method4(10,30));
    }
    private static int method1(){
        return 10;
    }
    public static void method3(){
        System.out.println("aaa");
        System.out.println("bbb");
        return;
    }
    public static int method4(int a ,int b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
}
