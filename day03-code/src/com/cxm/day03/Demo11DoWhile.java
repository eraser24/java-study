package com.cxm.day03;

/*
do while格式循环

do-while标准格式
do{
    循环体
}while（条件判断）；

do-while扩展格式
do{
    循环体
    步进语句
}while（条件判断）
 */
public class Demo11DoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("I am sorry " + i);
            i++;
        } while (i >= 10);
    }
}
