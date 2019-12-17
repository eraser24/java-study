package com.cxm.day06.demo02;

public class Demo02PhoneTwo {
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
        System.out.println("===================");


        Pthone two = new Pthone();
        System.out.println(two.brand);
        System.out.println(two.coler);
        System.out.println(two.price);
        System.out.println("===================");
        two.brand = "三星";
        two.price = 5999.0;
        two.coler = "蓝色";
        System.out.println(two.price);
        System.out.println(two.coler);
        System.out.println(two.brand);
        System.out.println("===================");

        two.call("欧巴");
        two.snedMessage();
    }
}
