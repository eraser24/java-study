package com.cxm.day01;
/*
数据类型分类：
    1、基本数据类型（四类八种）
        1、整数型   byte short int long
        2、浮点型   float double
        3、字符型   char
        4、布尔型   boolean
    2、引用数据类型
        1、字符串
        2、数组
        3、类
        4、接口
        5、Lambda

注意事项：
    1、字符串不是基本类型，是引用类型
    2、浮点型可能只是一个近似值，并非精确值
    3、数据范围与字节数不一定相关，float数据范围比long更加广泛，但是float是4字节，long是8字节
    4、浮点数当中默认类型是double。如果一定使用float类型，需要加上一个后缀，F
        如果是整数，默认为int类型，如果一定要使用long类型，需要加上后缀L
 */
public class Demo05DataType {
    public static void main(String[] args) {
        System.out.println(100);
        System.out.println(100L);
    }
}
