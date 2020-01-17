package com.cxm.day05.demo01;
/*
数组：是一种容器，可以存放多个数据

特点：
1、数组是引用数据类型
2、数组当中的多个数据，类型必须统一
3、数组的长度在运行期间不可改变。

数组的初始化：创建，赋予默认值
1、动态初始化，（指定长度）
2、静态初始化（指定内容）

动态初始化数组格式：
数据类型[] 数组名称 = new 数据类型 [数组长度]

解析：左侧，类型统一。左侧中括号，代表数组。左侧名称，名字
右侧new，创建。右侧数据类型和左边类型一致
右侧中括号的长度，数据长度
 */
public class Demo01Array {
    public static void main(String[] args) {
        int[] ArrayA = new int[300];
        double[] ArrayB = new double[10];
        String[] ArrayC = new String[5];
   }
}
