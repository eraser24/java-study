package com.cxm.day09.demo14;

public class User {
    private String name; //姓名
    private int money; //余额

    //显示当前用户名字，余额
    public void show() {
        System.out.println("我是：" + name + "我有：" + money);
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
