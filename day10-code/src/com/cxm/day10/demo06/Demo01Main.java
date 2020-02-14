package com.cxm.day10.demo06;
/*
向上转型一定是安全的，正确的，但是有弊端
对象一旦向上转型为父类，那么久无法调用子类原本特有方法

解决方案：用对象的向下转型【还原】
 */
public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型，就是父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();

        Cat cat = (Cat)animal;
        cat.catshMouse();
    }
}
