/*
一旦执行，立刻跳出当前循环剩余内容，马上进行下一次循环
 */
public class Demo15Continue {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 10 ; i++){
            if (i == 4) {
                System.out.println("哈哈哈哈");
                continue;
            }
            System.out.println( i + "层到了！！！");
        }
    }
}
