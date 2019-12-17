package com.cxm.day07.demo02;
/*
匿名对象的说明：

创建对象的标准格式
类名称 对象名 = new 类名称（参数）；

匿名对象，只有右边的对象，没有左边的类名称 对象名
注意事项：匿名对象只能使用一次，下次还要创建
使用建议：如果确定有一个对象，只需要使用唯一的一次，就可以用匿名对象

 */

public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "kobe";
        one.showName();
        System.out.println("=============");
        new Person().name = "科比";
        new Person().showName();
    }
}
