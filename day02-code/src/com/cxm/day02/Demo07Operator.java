package com.cxm.day02;
/*
��ֵ�����
��ֵ�������Ϊ��
1��������ֵ����������ǵȺš�=�� �������Ҳ�����ݽ���������
    int a = 30;
2�����ϸ�ֵ�������
    1��+=   a += 1 �൱��    a = a + 1
    2��-=    a -= 1 �൱��     a = a - 1
    3��*=    c *=5  �൱��     c = c * 5
    4��/=    d /= 6 �൱��    d = d / 6
    5��%=     e %= 7 �൱��    e = e % 7

ע�����
    1��ֻ�б�������ʹ�ø�ֵ��������������ܽ��и�ֵ
    2�����ϸ�ֵ�������������һ��ǿ������ת��
 */
public class Demo07Operator {
    public static void main(String[] args) {
        int a = 10;
        a += 5;
        System.out.println(a);

        int x = 10;
        x %= 3;
        System.out.println(x);


        byte num = 30;
        num += 5;
        System.out.println(num);
    }
}
