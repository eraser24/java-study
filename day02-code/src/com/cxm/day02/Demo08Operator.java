package com.cxm.day02;

/*
�Ƚ��������
== �ȽϷ������������Ƿ���ȣ���Ƚ����true��
< �ȽϷ�����ߵ������Ƿ�С���ұߵ����ݣ����С�ڽ����true��
> �ȽϷ�����ߵ������Ƿ�����ұߵ����ݣ�������ڽ����true��
<= �ȽϷ�����ߵ������Ƿ�С�ڻ��ߵ����ұߵ����ݣ����С�ڽ����true��
>= �ȽϷ�����ߵ������Ƿ���ڻ��ߵ����ұߵ����ݣ����С�ڽ����true��
!= �����ڷ��� ������������ߵ����ݲ���ȣ������true��

ע�����
    1���Ƚ���������Ľ����һ��booleanֵ������true��������false
    2��������ж���жϣ���������д�����磺  1 < x < 4(no)

 */
public class Demo08Operator {
    public static void main(String[] args) {

        System.out.println(1 == 1);//true
        System.out.println(1 < 2);//true
        System.out.println(3 > 4);//false
        System.out.println(3 <= 4);//true
        System.out.println(3 >= 4);//false
        System.out.println(3 != 4);//true
    }
}
