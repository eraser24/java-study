package com.cxm.day02;
/*
�߼������
�루���ң� &&   ȫ����true������true������false
�򣨻��ߣ� ||    ֻҪ������һ����true��ȫ����false������false
�ǣ�ȡ����  ��    ������true�����false��

��·
��&&����||,���ж�·Ч�����������Ѿ������жϵõ����ս������ô�ұ߲���ִ�У���ʡ����

ע�����
    1���߼������ֻ������booleanֵ��
    2���롢����Ҫ���Ҹ���һ��booleanֵ������ȡ��ֻҪ��Ψһһ��booleanֵ���ɡ�
    3���룬�� ���������������ж����������������д
        ����   a && b
        ���   a && b && c
TIPS:
    ��Ӧ  1< x < 3 �����
    1 < x && x < 3
 */
public class Demo09Logic {
    public static void main(String[] args) {
        System.out.println(true && false);
        System.out.println(3 < 4 && 10 > 5);
        System.out.println("==========");

        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println("=================");

        System.out.println(!true);
        System.out.println(!false);

        System.out.println("===============");
        int a = 10 ;
        System.out.println(3 > 4 && ++a < 100);
        System.out.println(a);

        System.out.println("==========");
        int b = 20;
        System.out.println(3 < 4 || ++b < 100);
        System.out.println(b);
    }
}
