package com.cxm.day11.demo01;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
}
