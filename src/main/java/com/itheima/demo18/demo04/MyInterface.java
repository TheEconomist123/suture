package com.itheima.demo18.demo04;

public interface MyInterface {

    // private  default   protect  public
    void show1();

    void show2();

    public default void show3(){
        System.out.println("这是升级默认的方法。");
    }


}
