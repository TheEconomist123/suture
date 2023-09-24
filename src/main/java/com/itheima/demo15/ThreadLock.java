package com.itheima.demo15;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadLock implements Runnable {
    private int tickets = 100;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {

        while (true) {
            try {
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("正在出售第：" + tickets + "张票");
                    tickets--;
                }
            } finally {
                lock.unlock();
            }
        }

    }
}
