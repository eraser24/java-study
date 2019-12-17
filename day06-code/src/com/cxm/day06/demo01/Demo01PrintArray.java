package src.com.cxm.day06.demo01;
/*
面向过程：当需要实现一个功能的时候，每一个具体的步骤都是亲力亲为，详细处理每个细节
面向对象：实现功能，不关心具体步骤，找一个功能的人，做
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array= {10,20,30,40,50};

        //要求打印格式为 [10,20,30,40,50]

        //面向过程
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1  ){
                System.out.println(array[i] + "]");
            } else {

                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("===================");

        //使用面向对象
        //jdk提供好的array类，其中toString方法，就直接把数组变成想要的格式。
        System.out.println(Arrays.toString(array));
    }
}
