package com.cxm.day02;
/*
�����Լ�������
�����������++
�Լ��������--

���壺��һ��������һ������1��������һ������������1

ʹ�ø�ʽ��д�ڱ�������ǰ�����߱�������֮������++num ,num++

ʹ�÷�ʽ��
    1������ʹ�ã�������Ϊһ������
    2�����ʹ�ã������������죬����͸�ֵ���ߴ�ӡ���ʹ�ã�

ʹ������
    1���ڵ���ʹ�õ�ʱ��ǰ++ �ͺ�++ û���κ�����Ҳ����++num��num++������ȫһ����
    2�����ʹ�õ�ʱ���С��ش�����
        a�����ǰ++������+1��Ȼ�����Ž������ʹ�� ���ȼӺ��á�
        b������Ǻ�++�����ñ�����ֵ��Ȼ����+1.    �����ú�ӡ�

ע�����
    ֻ�б�������ʹ�������Լ���������������ʹ�������Լ�������

 */
public class Demo06Operator {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);

        //����ʹ��
        ++num1;
        System.out.println(num1);

        num1++;
        System.out.println(num1);
        System.out.println("================");

        int num2 = 20;
        System.out.println(++num2);
        System.out.println(num2);

        System.out.println("==============");
        int num3 = 30;
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println("==============");

        int x = 10;
        int y = 20;
        int result3 = ++x + y--;
        System.out.println(result3); //31
        System.out.println(x); //11
        System.out.println(y); //19
    }
}
