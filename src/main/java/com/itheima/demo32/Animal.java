package com.itheima.demo32;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/9/3 003
 * @time 21:23
 * @desc
 */
public abstract class Animal {
    public Animal() {
        System.out.println("动物类吃饭了。。。。。。。。。。");
    }

    public  abstract  void eat();

    public  void  show(){
        System.out.println("不是抽象方法却在抽象类里面。。。。。。。。。。。。。");
    }


}
