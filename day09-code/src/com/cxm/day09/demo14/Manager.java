package com.cxm.day09.demo14;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMenoy, int count) {
        //需要一个集合，存储若干个红包金额
        ArrayList<Integer> redList = new ArrayList<>();

        //看下群主有多钱
        int leftMoney = super.getMoney();
        if (totalMenoy > leftMoney) {
            System.out.println("余额不足");
            return redList;
        }

        //扣钱
        super.setMoney(leftMoney - totalMenoy);

        //发红包，平均拆分count
        int avg = totalMenoy / count;
        int mod = totalMenoy % count;//余数，零头
        //剩下的，放在最后一个红包里

        //放红包
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        int last = avg + mod;
        redList.add(last);

        return redList;

    }
}
