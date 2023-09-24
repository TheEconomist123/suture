package com.itheima.demo21;

public class Test {
    public static void main(String[] args) {


        SingleLazyDemo i1 = SingleLazyDemo.getInstance();
        SingleLazyDemo i2 = SingleLazyDemo.getInstance();

        System.out.println(i1==i2);

        System.out.println("---------------------------------");

        EnDemo[] values = EnDemo.values();
        for (EnDemo value : values) {
            System.out.println( "["+value.getIndex()+","+value.getName()+"]");
        }

        System.out.println(EnDemo.Blue.getName());

    }
}
