/*
1、在switch语句当中，执行立刻结束
2、循环语句总，立刻结束，打断循环

次数确定的场景多用for、否则用while
 */
public class Demo14Break {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println("Hello" + i);
            //如果希望从4次开始，打断循环
            if (i == 4) {
                break;
            }

        }
    }
}
