package com.cxm.day05.demo03;

public class Demo08ArrayReverse {
    public static void main(String[] args) {
        int[] array = new int[] {1,3,6,9,4,3};
        for (int i = array.length -1 ; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("=======================");
//        int min = 0;
//        int max = array.length -1;
//        int temp = a ;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
