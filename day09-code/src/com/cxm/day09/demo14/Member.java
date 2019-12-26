package com.cxm.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member(String name, int money) {
        super(name, money);
    }

    public Member() {
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包抽取一个，给自己
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        //根据索引，从集合当中删除，并得到被删除的红包，给自己
        int delta = list.remove(index);
        //当前成员本来有多少钱
        int money = super.getMoney();
        super.setMoney(money + delta);
    }

}
