package com.cxm.day10.demo05;
/*
访问成员变量的两种方法
1、直接通过对象名称访问成员 ：看等号左边是谁，没有向上找
2、间接通过成员方法访问  :  看该方法属于谁，没有向上找
 */
public class Demo01MultiField {
    public static void main(String[] args) {
        //多态
        Fu obj = new Zi();
        System.out.println(obj.num);
//        错误写法
//        System.out.println(obj.age);

        System.out.println("===============");
        //子类没有覆盖重写，所以用父
        //子类如果覆盖重写，就是子
        obj.showNum();
    }
}
