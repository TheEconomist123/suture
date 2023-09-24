package com.itheima.demo07;

public class FanDemo {

    public static void main(String[] args) {

        GenericDemo<String> gd = new GenericDemo<String>();

        gd.setT("法发顺丰");

        System.out.println(gd.getT());

        gd.show("请求我让我去");
        gd.show(true);


    }
}
