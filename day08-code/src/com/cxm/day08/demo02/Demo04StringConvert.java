package com.cxm.day08.demo02;
/*
String当中与转换相关的常用方法有：

public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值。
public byte[] getBytes()：获得当前字符串底层的字节数组。
public String replace(CharSequence oldString, CharSequence newString)：
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
备注：CharSequence意思就是说可以接受字符串类型。
 */
public class Demo04StringConvert {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        char[] chars = str1.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);

        //转换成字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        System.out.println("=============");

        //字符串的内容替换
        String str2 = "How do you do ??";
        String str3 =str2.replace("o","*");
        System.out.println(str2);
        System.out.println(str3);
    }
}
