package com.cxm.day07.demo04;
/*
集合概述和基本使用

ArrayList集合的长度，是可以随意变化的。

对于ArrayList来说，有一个尖括号<E>代表泛型
泛型：装在集合当中的所有元素，全部是什么类型（统一）
注意：泛型只能是引用类型，不能是基本类型

注意事项：
    对于ArrayList集合来说，直接打印的不是地址值，而是内容
    如果内容是空得到的就是空的中括号：[]
 */

import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是list，里边都是String类型数据
        //备注：从jdk1.7+开始右侧的尖括号可以不写，尖括号本身还是要写的，
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合当中添加数据，需要用add方法
        list.add("my name is add ");
        System.out.println(list);

        list.add("哈哈哈");
        list.add("嘻嘻嘻");
        System.out.println(list);
    }
}
