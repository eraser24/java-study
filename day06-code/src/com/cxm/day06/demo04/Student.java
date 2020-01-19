package com.cxm.day06.demo04;

/*
构造方法就是专门用来创建对象的方法，当我们通过关键字new来创建对象的时候，其实就是构造方法。
格式：
public 类名称(参数类型  参数名称) {
    方法体
}

注意事项：
1、构造方法的名称，必须和类名称一样
2、构造方法不要写返回值类型，连void都不写
3、构造方法不能return
4、如果没有编写任何构造方法，那么编译器，会赠送一个，没有参数，方法体什么事情都不做。
5、一旦编写至少一个构造方法，那么编译器不再赠送
6、构造方法重载：方法名相同，参数不同
 */
public class Student {

    //成员变量
    private String name;
    private int age;

    //无参数构造
    public Student(String name, int age) {
        System.out.println("全参构造方法执行了！");
        this.name = name;
        this.age = age;
    }

    //全参构造
    public Student() {
        System.out.println("无参构造方法执行了！");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
