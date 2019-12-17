package com.cxm.day04.demo02;
/*
方法就是语句的集合

参数：就是进入方法的数据
返回值：从方法出来的数据

定义方法的完整格式：
修饰符 返回值类型   方法名称 （参数类型  参数名称，、、、、、、）
    方法体
    return  返回值；


修饰符：  public static
返回值类型：数据结果类型
方法名称：名字，规则和变量一样  小驼峰
参数类型：
参数名称：
PS：参数多个逗号隔开
方法体：方法要做的事情
return：1、停止方法  2、返回值还给调用处
返回值：最终结果
return返回值，类型要对应

三要素
1、返回值类型
2、方法名称
3、参数列表

方法调用格式
1、单独调用 （参数）
2、打印调用  System.out.println("")
3、赋值调用   数据类型  变量名称 = 方法名称（参数）

注意：void方法
 */
public class Demo02MethodDefine {
    public static void main(String[] args) {
        sum(10,20);
        System.out.println("=================");
        System.out.println(sum(10,20));
        System.out.println("=========");
        int number = sum(15,25);
        number += 100;
        System.out.println(number);
    }
    public static int sum(int a ,int b){
        System.out.println("执行了");
        int result = a + b;
        return result;
    }
}
