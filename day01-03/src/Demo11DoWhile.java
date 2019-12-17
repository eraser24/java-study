/*
do {
    循环体
} whil （条件判断）；

扩展格式：
du {
    循环体
    步进表达式
} while （条件判断）
 */
public class Demo11DoWhile {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 10; i++) {
            System.out.println("你咋了" + i);
        }
        System.out.println("=====================");
        int i = 1;
        do {
            System.out.println("我错了！" + i);
            i++;
        } while (i <= 10);
    }
}
