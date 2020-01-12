package com.cxm.day02;
/*
强制类型转换
    1、特点：代码需要特殊格式处理，不能自动完成
    2、格式：范围小的类型  范围小的变量名 = （范围小的类型） 原本范围大的数据；

注意事项：
    1、强制类型转换，一般不推荐使用，因为有可能发生精度损失，数据溢出。
    2、byte/short/char 这三种类型都可以发送数学运算，例如：加法“+”
    3、byte/short/char 运算的时候，首先会提升为int类型，再计算
    4、boolean类型不能发生数据类型转换

 */
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo02DataType {
    public static void main(String[] args) {
        //左边是int  右边是long
        //long --> int
        //不能自动
        int num = (int) 100L;
        System.out.println(num);

        //数据溢出
        //long--> int
        int num2 = (int) 6000000000L;
        System.out.println(num2);

        //精度损失
        //double--> int
        int num3 = (int) 3.77;
        System.out.println(num3); //不是四舍五入

        //如果char类型进行了数学运算，字符会翻译成数字
        char zifu1 = 'A';
        System.out.println(zifu1 + 1);


        byte num4 = 40;
        byte num5 = 50;
        int result1 = num4 + num5;
        System.out.println(result1);

        short num6 = 60;
        short result2 = (short) (num4 + num6);
        System.out.println(result2);
    }
}
