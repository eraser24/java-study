package com.cxm.day05.demo03;

public class Demo09Reverse {
    public static void main(String[] args) {
        int[] array = {1,3,6,9,4,3};

        for (int min = 0, max = array.length - 1 ; min < max ; min++, max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        for (int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
