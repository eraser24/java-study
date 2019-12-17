package com.cxm.day06.demo03;
/*
局部变量和成员变量不同：
1、定义的位置不一样【重点】
    局部变量：在方法内部
    成员变量：在方法外部，直接写在类当中。

2、作用范围不一样【重点】
    局部变量：只有方法当中可以使用
    成员变量：整个类通用

3、默认值不一样【重点】
    局部变量：没有默认值，使用要手动赋值
    成员变量：如果没有赋值，会有默认值

4、内存位置不一样
    局部变量：位于栈内存中
    成员变量：位于堆内存中

5、生命周期不一样
    局部变量：谁在方法进栈而诞生，随着方法出栈而消失
    成员变量：随着对象创建而诞生，随着对象垃圾回收而消失
 */

public class Demo01VariableDifference {
    String name; //成员变量
    public void methodA(){
        int num = 20;
        System.out.println(num);
    }
    public void methodB(int param){
        System.out.println(param);
//错误写法        System.out.println(num);
    }
}
