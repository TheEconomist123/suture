package com.itheima.demo15;

public class MyRunnable implements Runnable {

    @Override
    public void run() {

        while(true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "---" + i);
            }
        }

    }
}
