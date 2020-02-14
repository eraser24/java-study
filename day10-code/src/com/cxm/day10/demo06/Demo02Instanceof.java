package com.cxm.day10.demo06;

/*
如何才能知道一个父类引用的对象，本来是什么子类？

格式：
对象 instanceof 类型
这将会得到一个boolean值结果，也就是判断前面对象能不能当做后面类型的实例
 */
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catshMouse();
        }

        giveMeAPet(new Dog());
    }

    public static void giveMeAPet(Animal animal){
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catshMouse();
        }
    }
}
