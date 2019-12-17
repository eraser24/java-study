package com.cxm.day07.demo03;

import java.util.Random;

/*
Random 指定随机数范围
 */
public class Demo02Random {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int i1 = random.nextInt(10);
            System.out.println("随机数是：" + i1);
        }
//        int num = ran dom.nextInt();
//        System.out.println("随机数是：" + num);
    }
}
