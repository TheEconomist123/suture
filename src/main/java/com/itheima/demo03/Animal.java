package com.itheima.demo03;

public abstract class Animal {

    public static  final  int age = 10000000;

    public Animal() {
        //抽象类不能直接实例化，可以通过多态实例化。
    }


    //抽象方法必须在抽象类里面。
    //抽象类里面可以没有抽象方法
    public abstract void eat();
    //抽象类是抽象的不可以创建对象，可以通过继承,多态.x`

    //抽象类里面可以有抽象方法
    public void sleep() {
        System.out.println("动物睡觉。。。。");
    }
}
