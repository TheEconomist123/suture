package com.itheima.demo15;

public class MyLock {

    public static void main(String[] args) {

        ThreadLock tl = new ThreadLock();
        Thread th1 = new Thread(tl,"窗口一");
        Thread th2 = new Thread(tl,"窗口二");
        Thread th3 = new Thread(tl,"窗口三");

        th1.start();
        th2.start();
        th3.start();

    }
}
