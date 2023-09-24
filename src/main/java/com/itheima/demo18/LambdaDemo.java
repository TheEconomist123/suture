package com.itheima.demo18;

public class LambdaDemo {

    public static void main(String[] args) {

        //匿名内部分类方式
        /*  new Thread(new Runnable() {
              @Override
              public void run() {

                  System.out.println("多线程启动....");
              }
          }).start();*/

         //
         new Thread(()->{
             System.out.println("多线程启动...");
         }).start();
    }
}
