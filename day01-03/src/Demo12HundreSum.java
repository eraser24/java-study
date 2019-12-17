/*
要求：求出1-100之间的偶数和。
 */
public class Demo12HundreSum {
    public static void main(String[] args) {
        /*int sum1 = 0;
        for (int i = 1; i <= 100 && i % 2 == 0; i++) {
            sum1 += i;
        }
        System.out.println(sum1);
        */
        System.out.println("=========================");
        int sum = 0;
        for (int i = 2; i <= 100; i+=2) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println("=========================");
        int sum1 = 0;
        int i = 2;
        while ( i <= 100  ) {
            sum1 += i;
            i += 2;
        }
        System.out.println("结果为:" + sum1);

        int sum2 = 0;
        int i1 = 2;
        do {
            sum2 += i1;
            i1 += 2;
        } while (i1 <= 100);
        System.out.println("结果为：" + sum2 );
    }
}

