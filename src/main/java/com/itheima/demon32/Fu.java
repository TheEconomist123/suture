package com.itheima.demon32;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/9/3 003
 * @time 9:04
 * @desc
 */
public class Fu {

    public Fu() {
        System.out.println("父类构造方法");
    }

    public Fu(int num) {
        System.out.println("父类构造方法。。。。。。。"+num);
    }

    public  static  void show1(){
        System.out.println("父亲里面的静态方法");
    }


    int num=10;


    public  void  eat(){
        System.out.println("父亲吃饭。。。。。");
    }

    public  void method(){
        System.out.println("父亲 method.....");
    }
}
