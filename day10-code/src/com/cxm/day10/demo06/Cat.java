package com.cxm.day10.demo06;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catshMouse(){
        System.out.println("猫抓老鼠");
    }
}
