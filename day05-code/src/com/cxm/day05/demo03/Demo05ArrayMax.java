package src.com.cxm.day05.demo03;

/*
练习，求出数组当中最大值
 */
public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5, 12, 9,8,7};
        int max = arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {
            if (arrayA[i] > max){
                max = arrayA[i];
            }
        }
        System.out.println(max);
    }
}
