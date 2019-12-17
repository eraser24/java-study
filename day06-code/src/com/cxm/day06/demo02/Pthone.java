package com.cxm.day06.demo02;
/*
定义一个类，用来模拟手机
属性：品牌、价格、颜色
行为：打电话、发短信

对应到类：
    成员变量（属性）：
        String brand; //品牌
        double price; //价格
        String color; //颜色
    成员方法（行为）：
        public void call(String who){} //打电话
        public void call(){} //群发短信
 */
public class Pthone {
    String brand;
    double price;
    String coler;

    public void call(String who){
        System.out.println("给" + who + "打电话");
    }
    public void snedMessage(){
        System.out.println("群发短信");
    }
}
