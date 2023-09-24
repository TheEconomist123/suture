package com.itheima.demo05;

public class Outer {


    public  void method(){

     /*   new Inner(){

            @Override
            public void show() {
                System.out.println("匿名内部类。。。");
            }
        };*/

        new Inner(){

            @Override
            public void show() {
                System.out.println("匿名内部类。。。");
            }
        }.show();



    }




}
