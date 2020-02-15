package com.cxm.day11.demo01;
/*
当final关键字来修饰一个方法的时候，这个方法不能被覆盖重写

格式：
修饰符 final 返回值类型  方法名称（参数列表 ）

注意事项：
对于类、 方法来说，abstract关键字和final关键字不能同时使用，矛盾
 */
public class Fu {
    public final void method(){
        System.out.println("父类方法执行！！");
    }
}
