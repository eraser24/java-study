package src.com.cxm.day05.demo03;

/*
练习：数组元素的反转
只用一个数组
 */
public class Demo06Daoxu {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5, 6, 7};
        for (int length = arrayA.length; length > 0; length--) {
            System.out.println(arrayA[length - 1]);
        }
        System.out.println("==================");


        int[] arrayB = {1, 3, 5, 7, 8};
        int mem;
        for (int i = 0; i < arrayB.length / 2; i++) {
            mem = arrayB[i];
            System.out.println("men值为" + mem);
            arrayB[i] = arrayB[arrayB.length - 1 - i];
            System.out.println("前边为" + arrayB[i]);
            arrayB[arrayB.length - 1 - i] = mem;
            System.out.println("后边为" + arrayB[arrayB.length - 1 - i]);
        }


        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }

        System.out.println("======================");
        //遍历打印数组
        int[] arrayC = {11, 22, 33, 44, 55, 66};
//        System.out.println(arrayC.length-1);
        for (int min = 0, max = arrayC.length-1 ; max > min; min++, max--) {
            int tmp = arrayC[min];
            arrayC[min] = arrayC[max];
            arrayC[max] = tmp;
        }
        System.out.println("111");
        System.out.println(arrayC[0]);

    }
}

