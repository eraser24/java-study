package com.cxm.day02;
/*
�������㵱�еļӺţ���3���÷�
1������ֵ��˵�ǣ��ӷ�
2�����ַ�char��˵���ڼ���ǰ��������Ϊint��Ȼ����㡣
    char�����ַ�����int����֮�����ASCLL�� Unicode��
3����Ӧ�ַ���String�����ǹؼ��֣� ��˵���ӺŴ����ַ������Ӳ���

�κ��������ͺ��ַ������ӵ�ʱ�򣬶������ַ���
 */
public class Demo05Plus {
    public static void main(String[] args) {
        String str1 = "aaaa";
        String str2 = "bbbb";
        System.out.println(str1 + str2);
        System.out.println("Hello" + "World" + "!!!");

        String str3 = "Java";
        System.out.println(str3 + 20);

        //���ȼ�����
        System.out.println( 20 + 10 + str2 + 20 + 30);
        System.out.println( 20 + 10 + str2 + (20 + 30));
        System.out.println( 20 + (10 + str2) + (20 + 30));
    }
}
