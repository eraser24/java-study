package com.cxm.day01;

/*
变量的注意事项；
1、如果创建多个变量，那么变量之间的名称不可以重复
2、对应float和long类型来说，后缀F和L不能丢掉
3、如果使用byte和short类型的变量，右侧的数据值范围，不能超过左侧的数据范围
4、没有赋值的变量，不能直接使用，一定要复制之后才能使用。
5、变量使用不能操作作用域的范围
【作用域】：从定义变量的一行开始，一直到直接所属的大括号结束为止。
6、可以通个一个语句来创建多个变量，但是一般情况不推荐
 */
public class Demo08VariableNotice {
    public static void main(String[] args) {
        int num1 = 10;
//        int num1 = 200；
        int a,b,c;
        a = 10;
        b = 20;
        c = 30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //同时创建三个变量，同时赋值
        int x = 100,y = 200 , z = 300;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
