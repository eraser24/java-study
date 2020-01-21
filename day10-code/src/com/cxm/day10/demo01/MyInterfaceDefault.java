package com.cxm.day10.demo01;
/*
c从java8开始，接口允许定义默认方法。
格式：
public default 返回值类型 方法名称（方法列表）{
    方法体
}

备注：接口当中的默认方法，可以解决接口升级的问题。
 */
public interface MyInterfaceDefault {
    public abstract void methodAbs();
//    public abstract void methodAbs2();
    /*  新添加的方法，改成默认方法*/
    public default void methodDefault(){
        System.out.println("这是添加的默认方法");
    }

}
