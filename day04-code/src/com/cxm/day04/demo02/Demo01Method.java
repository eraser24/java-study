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
        printMethod();
            }
            public static void printMethod () {
                for (int j = 0; j < 5; j++) {
                    for (int i = 0; i < 20; i++) {
                        System.out.print("*");
            }
                    System.out.println();
        }
    }

}

