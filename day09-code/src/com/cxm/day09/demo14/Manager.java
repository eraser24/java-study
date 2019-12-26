package com.cxm.day09.demo14;

import java.lang.reflect.Array;
import java.util.ArrayList;
//群主类
public class Manager extends User {
    public Manager(String name, int money) {
        super(name, money);
    }

    public Manager() {
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        //首先需要一个集合，用来红包金额
        ArrayList<Integer> redList = new ArrayList<>();

        //首先看下群主有多钱
        int leftMoney = super.getMoney();   //群主当前余额
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList;  //返回集合
        }
        //扣钱
        super.setMoney(leftMoney - totalMoney);

        //发红包需要平均拆分成为count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;//余数，零头

        //除不开的零头，包在最后一个红包当中
        //下面把红包一个一个放到集合当中

        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        //最后一个红包
        int last = avg + mod;
        redList.add(last);
        return redList;
    }


}
