package com.cxm.day03;
/*
continue关键字
一旦执行，立刻跳过当前次循环，马上开始下一次循环
 */
public class Demo15Continue {
    public static void main(String[] args) {
        for (int i = 1; i <=10;i++){
            if (i == 4){
                continue;
            }
            System.out.println(i +" 楼到了");
        }
    }
}
