package com.cxm.day02;
/*
赋值运算符
赋值运算符分为：
1、基本赋值运算符：就是等号“=” ，代表将右侧的数据交给左侧变量
    int a = 30;
2、复合赋值运算符：
    1、+=   a += 1 相当于    a = a + 1
    2、-=    a -= 1 相当于     a = a - 1
    3、*=    c *=5  相当于     c = c * 5
    4、/=    d /= 6 相当于    d = d / 6
    5、%=     e %= 7 相当于    e = e % 7

注意事项：
    1、只有变量才能使用赋值运算符，常量不能进行赋值
    2、复合赋值运算符，隐含了一个强制类型转换
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
