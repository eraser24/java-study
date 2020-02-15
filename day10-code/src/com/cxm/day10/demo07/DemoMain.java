package com.cxm.day10.demo07;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        //准备鼠标，为电脑使用

        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);


        //创建一个usb键盘
        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);

        computer.powerOff();
    }
}
