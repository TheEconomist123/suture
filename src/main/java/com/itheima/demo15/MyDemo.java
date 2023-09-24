package com.itheima.demo15;

public class MyDemo {
    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        Thread th1 = new Thread(myRunnable,"高铁");
        Thread th2 = new Thread(myRunnable,"飞机");
        th1.start();
        th2.start();


    }
}
