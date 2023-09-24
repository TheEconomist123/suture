package com.itheima.demo18.demo05;

public class InterDemo {

    public static void main(String[] args) {
        Inter inter = new InterImpl();
        inter.show();
        inter.show1();

        Inter.show2();

        Flyable.show();

    }
}
