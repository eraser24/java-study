package com.cxm.day09.demo06;

public class NewPhone extends Phone {
    @Override
    public void show() {
        super.show();
        System.out.println("姓名");
        System.out.println("显示头像");
    }
}
