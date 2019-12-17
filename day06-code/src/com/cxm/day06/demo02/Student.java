package com.cxm.day06.demo02;
/*
对应基本类型当中的boolean值，Getter方法一定要写成isXxx形式，而setXxx规则不变

 */
public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setMale(boolean b){
        male = b;
    }
    public boolean isMale(){
        return male;
    }

    public void setName(String str) {
        name = str;
    }
    public String getName(){
        return name;
    }

    public void setAge(int num) {
        age = num;
    }
    public int getAge(){
        return age;
    }


}
