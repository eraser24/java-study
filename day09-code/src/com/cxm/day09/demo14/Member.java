package com.cxm.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

//收红包的类
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从列表中随机获取索引编号
        int index = new Random().nextInt(list.size());
        //删除自己的红包，给自己加上
        int delta = list.remove(index);

        //当前成员现在多钱
        int money = super.getMoney();
//        设置回去
        super.setMoney(money + delta);
    }
}
