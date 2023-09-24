package com.itheima.demo14;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class MyDeamon {


    public static void main(String[] args) {

        ThreadDeamon td1 = new ThreadDeamon();
        ThreadDeamon td2 = new ThreadDeamon();
        Thread.currentThread().setName("刘备");
        td1.setName("护卫一");
        td2.setName("护卫二");
        td1.setDaemon(true);
        td2.setDaemon(true);
        td1.start();
        td2.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}
