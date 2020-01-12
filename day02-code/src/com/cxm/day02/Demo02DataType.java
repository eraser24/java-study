package com.cxm.day02;
/*
强制类型转换
    1、特点：代码需要特殊格式处理，不能自动完成
    2、格式：范围小的类型  范围小的变量名 = （范围小的类型） 原本范围大的数据；
 */
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo02DataType {
    public static void main(String[] args) {
        //左边是int  右边是long
        //long --> int
        //不能自动
        int num = (int) 100L;
        System.out.println(num);
    }
}
