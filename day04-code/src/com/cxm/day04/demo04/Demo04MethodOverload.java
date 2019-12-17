package com.cxm.day04.demo04;
/*
对应功能类似的方法来说，因为参数列表不同，名称太多

方法的重载（OverLoad）
方法的名称一样，但是参数列表不一样

好处：一个方法名称，就可以多个功能

方法重载因素：
1、参数个数不同
2、参数类型不同
3、多类型顺序不同

无关因素：
1、名称无关
2、返回值类型无关
 */
public class Demo04MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,30));
    }
    public static int sum(int a ,int b){
        return a + b;
    }
    public static int sum(int a ,int b ,int c){
        return a + b + c ;
    }
    public static int sum(int a ,int b ,int c , int d){
        return a + b + c + d;
    }
    public static int sum(double a ,double b){
        return (int) (a + b) ;
    }
}
