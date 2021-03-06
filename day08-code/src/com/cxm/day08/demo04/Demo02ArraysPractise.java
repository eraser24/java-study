package com.cxm.day08.demo04;

import java.util.Arrays;

/*
题目：
请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "asdfweradsfghjklzxcvbnm";

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
//        System.out.println(Arrays.toString(args));

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]+ ",");
        }
    }
}
