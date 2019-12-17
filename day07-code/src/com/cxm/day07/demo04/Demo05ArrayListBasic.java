package com.cxm.day07.demo04;
/*
ArrayList
集合存储基本数据类型

如果希望想ArrayList当中存储基本类型，必须使用基本类型的“包装类”

基本类型    包装类（引用类型，都位于java.lang包下）
byte        Byte
short       Short
int         Integet[特殊]
long        Long
float       Float
double      Double
char        Character
boolean     Boolean

从jdk1.5+支持自动装箱，自动拆箱
自动装箱  ———》包装类型
自动拆箱  ———》基本类型
 */
import java.util.ArrayList;

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();

        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(100);
        listB.add(200);
        System.out.println(listB);

        int num1 = listB.get(1);
        System.out.println("第一号元素是:" + num1);


    }
}
