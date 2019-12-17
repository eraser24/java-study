package src.com.cxm.day06.demo01;
/*
一个类不能直接使用，需要根据类创建对象
1、导包：指出需要使用的类，在什么位置
    import 包名称.类名称；
    当前类属于同一个包的情况，可以省略导包
2、创建
    类名称 对象名 = new 类名称（）；
    Student stu = new Student();
3、使用
    1、使用成员变量：对象名.成员变量名
    2、使用成员方法：对象名.成员方名（参数）
    （想用谁，就用对象名点谁）

注意事项：
如果成员变量没有赋值，会有默认值
 */
public class Demo02Student {
    public static void main(String[] args) {
        //1、导包  ------省略
        //2、创建
        //格式：类名称 对象名 = new 类名称（）；
        Student stu = new Student();

        //3、使用成员变量
        //对象名.成员变量名
        System.out.println(stu.name);
        System.out.println(stu.age);

        stu.name = "kobe";
        System.out.println(stu.name);

        //4、使用成员方法
        //对象.成员方法
        stu.eat();
        stu.sleep();
    }
}
