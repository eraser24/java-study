package com.cxm.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
    生成6个1-33直接的随机数，添加到集合当中，并遍历

思路：
1、6个数字，创建集合<Integer>
2、产生随机数 Random
3、循环 6次
4、循环内调用r.nextInt(int n ) +1
5、添加add
6、遍历集合 for size get
 */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int a = random.nextInt(33) +1 ;
            list.add(a);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
