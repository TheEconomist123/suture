package com.itheima.demo16.repeat;

public class Box {

    private int milk;

    private boolean state = false;


    public synchronized void put(int milk) {

        if (state) {
            //奶箱有奶我们暂时等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        //有奶生产
        this.milk = milk;
        System.out.println("送奶工将生产第：" + milk + "奶");

        //生产后改变奶的状态
        state = true;
        notifyAll();

    }

    public synchronized void get() {
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户拿到了第:" + milk + "牛奶！"+Thread.currentThread().getName());
        state = false;
        notifyAll();
    }
}
