package com.cxm.day04.demo02;

/*
定义格式
public static void main() {
方法体
}
调用格式：
方法名称（）

注意事项：
1、方法定义无先后顺序
2、不能嵌套
3、要调用
* */
public class Demo01Method {
    public static void main(String[] args) {
        Method();
    }

    public static void Method() {
        for (int heng = 0; heng < 5; heng++) {
            for (int shu = 0; shu < 20; shu++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}

