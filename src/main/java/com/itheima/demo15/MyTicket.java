package com.itheima.demo15;

public class MyTicket {


    public static void main(String[] args) {


        TicketsRunnable tr = new TicketsRunnable();

        Thread th1 = new Thread(tr,"窗口一");
        Thread th2 = new Thread(tr,"窗口二");
        Thread th3 = new Thread(tr,"窗口三");
        th1.start();
        th2.start();
        th3.start();


    }
}
