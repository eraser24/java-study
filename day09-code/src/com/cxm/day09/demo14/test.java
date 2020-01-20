package com.cxm.day09.demo14;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int a = random.nextInt(3);
            System.out.println(a);
        }

    }


}
