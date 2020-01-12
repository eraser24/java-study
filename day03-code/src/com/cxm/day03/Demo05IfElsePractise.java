package com.cxm.day03;

/*
if 语句练习-判断考试成绩
指定考试成绩，判断学生等级
90-100 优秀
80-89 好
70-79 良
60-69 及格
60 以下 不及格
 */
public class Demo05IfElsePractise {
    public static void main(String[] args) {
        int score = 11;
        if (score <= 100 && score >= 90) {
            System.out.println("成绩是优秀");
        } else if (score >= 80 && score <= 89) {
            System.out.println("成绩是好");
        } else if (70 <= score && score <= 79) {
            System.out.println("成绩是良");
        } else if (60 <= score && score <= 69) {
            System.out.println("成绩是及格");
        } else if (60 > score) {
            System.out.println("成绩是不及格");
        } else {
            System.out.println("输入错误");
        }
    }
}
