package com.cxm.day09.demo05;
/*
方法覆盖重写的注意事项：
1、父子类之间方法名称相同，参数列表页相同
@Override:写在方法前边，用来检测是不是有效覆盖重写
这个注解如果不写，只要满足要求，也是正确的覆盖重写

2、子类方法的返回值，必须小于等于返回值的范围
Object类是所有类的公共最高父类，继承关系的顶端

3、子类方法的权限必须大于等于父类权限的权限修饰符
提示：public > protected > (default) > private
 */
public class Demo01Override {
}
