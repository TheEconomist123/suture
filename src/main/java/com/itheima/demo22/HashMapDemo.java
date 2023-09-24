package com.itheima.demo22;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

//测试hashMap线程不安全例子
public class HashMapDemo {

    public static void main(String[] args) {


        Map hashMap = new HashMap();


        for (int i = 0; i < 30; i++) {

            new Thread(() -> {
                hashMap.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0, 8));

                System.out.println("hashMap = " + hashMap);
            }).start();

        }
    }
}
