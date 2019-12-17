package com.cxm.day06.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        //类名称 对象吗 = new 类名称（）
        Pthone one = new Pthone();
        System.out.println(one.brand);
        System.out.println(one.coler);
        System.out.println(one.price);
        System.out.println("===================");
        one.brand = "苹果";
        one.price = 8388.0;
        one.coler = "黑色";
        System.out.println(one.price);
        System.out.println(one.coler);
        System.out.println(one.brand);
        System.out.println("===================");

        one.call("乔布斯");
        one.snedMessage();
    }
}
