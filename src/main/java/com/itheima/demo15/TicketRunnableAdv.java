package com.itheima.demo15;

public class TicketRunnableAdv implements Runnable {


    private  static  int tickets = 100;

    private Object obj = new Object();
    private int x = 0;


    @Override
    public void run() {

        while (true) {
            if (x % 2 == 0) {
                synchronized (TicketRunnableAdv.class) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第：" + tickets + "张票");
                        tickets--;
                    }
                }

            } else {
                sellTicket();
            }
            x++;
        }
    }

    private  static synchronized void   sellTicket() {

        if (tickets > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售第：" + tickets + "张票");
            tickets--;
        }

    }
}
