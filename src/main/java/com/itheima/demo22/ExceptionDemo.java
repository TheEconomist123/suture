package com.itheima.demo22;

public class ExceptionDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        if (a == 10) {
            throw new ArithmeticException("a不可以等于10");

        } else {
            System.out.println("合理。。。。。。");
        }


        System.out.println(b);


    }
}
