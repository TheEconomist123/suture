package com.itheima.demo15;

public class MyAdv {
    public static void main(String[] args) {

        TicketRunnableAdv tra1 = new TicketRunnableAdv();



        Thread t1 = new Thread(tra1, "售票1");
        Thread t2 = new Thread(tra1, "售票2");
        Thread t3 = new Thread(tra1, "售票3");

        t1.start();
        t2.start();
        t3.start();
    }
}
