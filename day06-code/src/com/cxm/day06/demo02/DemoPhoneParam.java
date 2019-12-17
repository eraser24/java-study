package com.cxm.day06.demo02;

public class DemoPhoneParam {
    public static void main(String[] args) {
        Pthone one = new Pthone();
        one.brand = "apple";
        one.price = 8388.0;
        one.coler = "土豪金";

        method(one); //传递进去的是地址值
    }
    public static void method(Pthone param){
        System.out.println(param.brand);
        System.out.println(param.coler);
        System.out.println(param.price);

    }
}
