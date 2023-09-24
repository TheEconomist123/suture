package com.itheima.demo14;

public class ThreadDeamon  extends   Thread{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName()+"-------"+i);
        }
    }
}
