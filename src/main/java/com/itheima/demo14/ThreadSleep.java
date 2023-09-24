package com.itheima.demo14;

public class ThreadSleep  extends   Thread{

    @Override
    public void run() {
        for (int i = 0; i <50 ; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
