package src.com.cxm.day05.demo03;

/*
遍历数组，挨个处理，打印
 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {15, 25, 35, 45, 55, 65, 75, 85};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("===============");
        int[] arrayA = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }


    }
}
