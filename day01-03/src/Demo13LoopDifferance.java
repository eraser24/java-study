/*
do while   ;   while     ;for循环区别
1、如果条件判断从来没有满足过，那么for while会执行0次，但是do-while会执行一次
2、for循环的变量在小括号当中定义，只有循环内部才可以使用。
 */
public class Demo13LoopDifferance {
    public static void main(String[] args) {
        for (int i = 1 ; i < 0 ; i++) {
            System.out.println("Hello");
        }
 //2、       System.out.println(i);
        System.out.println("=================");
        int i = 1 ;
        do {
            System.out.println("World");
            i++;
        } while (i < 0);
        System.out.println(i);
    }
}
