package com.itheima.demo16.repeat;

public class BoxDemo {

    public static void main(String[] args) {

        Box box = new Box();

        Producer p = new Producer(box);
        Customer c = new Customer(box);

        Thread pr = new Thread(p,"生产者");
        Thread cu = new Thread(c,"消费者1");

        pr.start();
        cu.start();



    }
}
