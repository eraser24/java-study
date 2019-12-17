package src.com.cxm.day05.demo03;

import java.util.Arrays;

public class Demo07Er {
    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int temp = 0;
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length / 2; i++) {
            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(a));

    }
}
