package com.itheima.demo14;

public class MyDemo {

    public static void main(String[] args) {

        Thread.currentThread().setName("主线程");
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        //run() 仅仅就是调用线程的意思，没有重新开辟线程，还是在原来线程中执行
  /*      m1.run();
        m2.run();
*/
        m1.setName("小鱼儿");
        m2.setName("花无缺");
        //开辟线程
        m1.start();
        m2.start();
        Thread.currentThread().setPriority(10);

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getPriority() + "----" + i);
        }
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);


    }
}
