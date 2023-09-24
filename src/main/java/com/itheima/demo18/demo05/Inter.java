package com.itheima.demo18.demo05;

public interface Inter {

    public  abstract   void show();

    default   void   show1(){
        System.out.println("默认方法。。。");
    }

    public  static  void  show2(){
        System.out.println("静态方法....");
    }



}
