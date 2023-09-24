package com.itheima.demo02;

public class AnimalDemo {

    public static void main(String[] args) {
        Animal a = new Cat();
        System.out.println(a.age);
      //  a.show();
        //成员变量，编译看左边运行看左边，
        //成员方法，编译看左边，运行看右边。(只针对重写的方法)
        Cat cat = new Cat();
        cat.show1();

      Cat aa=   (Cat)a;
      aa.show1();
      //没有方法体的方法应该定义为抽象方法，类中有抽象方法，该类必须定义为抽象类，


    }
}
