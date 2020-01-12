package com.cxm.day02;
/*
方法：

定义一个方法的格式：
public static void 方法名称(){
    方法体
}

方法名称的命名规则和变量一样，使用小驼峰
方法体：也就是大括号当中可以包含任意条语句。

注意事项：
    1、方法定义的先后顺序无所谓。
    2、方法的定义不能产生嵌套的包含关系。
    3、方法定义好之后，不会执行，如果想执行。一定要进行方法的【调用】

调用方法：
方法名称();
 */
public class Dmoe11Method {
    public static void main(String[] args) {
    farmer();
    seller();
    cook();
    }
    public static void farmer(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }
    public static void seller(){
        System.out.println("11");
        System.out.println("12");
        System.out.println("13");
    }
    public static void cook(){
        System.out.println("21");
        System.out.println("22");
        System.out.println("23");
    }

}
