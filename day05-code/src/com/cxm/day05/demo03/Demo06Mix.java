package src.com.cxm.day05.demo03;

public class Demo06Mix {
    public static void main(String[] args) {
        int[] array = {1, 4, -20, 6, 8};
        int mix = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < mix){
                mix = array[i];
            }
        }
        System.out.println("最小值是" + mix);
    }
}
