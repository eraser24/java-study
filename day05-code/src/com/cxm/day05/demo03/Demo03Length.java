package src.com.cxm.day05.demo03;
/*
如何获取数组长度，格式：
数组名称.length

数组创建，长度不可以更改。

 */
public class Demo03Length {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = new int [] {10, 20, 30, 40, 50};
        int len = arrayB.length;
        System.out.println("arrayB数组的长度为" + len);
        System.out.println("======================");
        int[] arrayC = new int[3];
        System.out.println(arrayC);
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC);
        System.out.println(arrayC.length);

    }
}
