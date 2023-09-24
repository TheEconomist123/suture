package com.itheima.demo18.demo04;

public class Test01 {

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("lambda表达式。。。" + Thread.currentThread().getName());
        new Thread(r, "小明").start();

    }
}
