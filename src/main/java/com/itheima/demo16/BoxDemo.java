package com.itheima.demo16;

public class BoxDemo {

    public static void main(String[] args) {

        Box box = new Box();
        Producer producer = new Producer(box);
        Customer customer = new Customer(box);
        Thread p = new Thread(producer, "生产者");
        Thread c = new Thread(customer, "消费者");
        p.start();
        c.start();


    }
}
