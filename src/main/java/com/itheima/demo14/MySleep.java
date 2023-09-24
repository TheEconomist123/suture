package com.itheima.demo14;

public class MySleep {

    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();

        ts1.setName("小红");
        ts2.setName("小明");
        ts3.setName("小李");
        ts1.start();
        ts2.start();
        ts3.start();
    }
}
