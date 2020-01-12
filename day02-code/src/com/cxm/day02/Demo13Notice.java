package com.cxm.day02;
/*
再给变量赋值的时候，如果右侧表达式当中都是常量，没有任何变量
javac会直接将若干表达式计算得到结果

short result = 13;
右侧没有超过范围，所以正确

这成为编译器的常量优化

注意事项：
一旦表达式有变量参与，就不能进行这种优化了
 */
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo13Notice {
    public static void main(String[] args) {
        short num1 = 1;

        short a = 5;
        short b = 8;
        short result = (short) (a + b);

        short result2 = 5 + 8;
        System.out.println(result2);
    }

}
