package com.cxm.day08.domo02;
/*
String当中与获取相关的常用方法有：

public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
 */
public class Demo02StringGet {
    public static void main(String[] args) {
        //获取字符串长度
        int length = "askdljf;akjds;fkaj;sdkf".length();
        System.out.println("长度为：" + length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("==================");

        //获取指定索引位置的单个字符
        char c = "Hello".charAt(1);
        System.out.println("index 1 is:" + c);

        System.out.println("=============");

        //查找参数字符串在本来字符串当中第一次出现的索引位置
        String original = "HelloWorld";
        int index = original.indexOf("llo");
        System.out.println("index is :" + index);

        System.out.println("Hello".indexOf(23));

    }
}
