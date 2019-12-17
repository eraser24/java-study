package com.cxm.day06.demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Pthone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.coler);
    }

    public static Pthone getPhone(){
        Pthone one = new Pthone();
        one.brand = "苹果";
        one.price = 8388.0;
        one.coler = "玫瑰金";
        return one;
    }
}
