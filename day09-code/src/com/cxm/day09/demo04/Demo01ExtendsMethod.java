package com.cxm.day09.demo04;
/*
在父子类的继承中，创建子类对象，访问成员方法的规则：
    创建的对象是谁，就优先谁用，如果没有则向上

注意事项：
    不论是成员方法还是成员变量，如果没有都是向上，而不会向下。
 */
public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodZi();
        zi.methodFu();

        zi.method();
    }
}
