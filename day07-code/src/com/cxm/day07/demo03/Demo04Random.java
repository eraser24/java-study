package com.cxm.day07.demo03;
/*
Randow练习：
猜字小游戏：
    键盘输入 判断大小 统计次数，

思路：
1.产生随机数字，并且一旦产生不再变化。random.nextInt方法
2、需要键盘输入Scanner
3、获取键盘获取数字scanner.nextInt
4、已经得到了两个数字，判断（if）一下；
    如果太大，提示，并重试
    如果太小，提示，并重试
    如果猜中了，游戏结束
5、重试就是再来一次，循环。循环次数不确定while（true）
 */

import java.util.Random;
import java.util.Scanner;

public class Demo04Random {
    public static void main(String[] args) {
//        System.out.println("游戏开始，猜数字");
        Random random = new Random();
        int ran = random.nextInt(100) + 1;
        System.out.println(ran);
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (true){
            System.out.println("请输入你猜测的数字");
            int num = scanner.nextInt();
            if (num > ran) {
                System.out.println("你的数字太大了");
                count++;
            } else if (num < ran){
                System.out.println("你的数字太小了");
                count++;
            } else {
                System.out.println("恭喜你答对了");

                break;
            }
        }
        System.out.println("游戏结束");
        System.out.println("你使用了" + count + "次机会");
    }
}
