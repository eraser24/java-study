package src.com.cxm.day05.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 35,45};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            //如果当前
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("最大值" + max);

    }
}
