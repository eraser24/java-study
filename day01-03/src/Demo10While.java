/*
1、标准格式
whil (条件判断) {
循环体
}

2、扩展格式
初始化语句；
while （条件判断） {
    循环体；
    步进语句；
}
 */
public class Demo10While {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10){
            System.out.println("我错了" + i);
            i++;
        }
    }
}
