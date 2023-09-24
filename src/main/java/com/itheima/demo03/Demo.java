package com.itheima.demo03;

public class Demo {

    public static void main(String[] args) {

        Animal an=  new  Cat();
        System.out.println(an.age);

        an.eat();
        an.sleep();
        System.out.println(an.age);

        Cat  c=new Cat();
        System.out.println(c.age);
        c.sleep();

        System.out.println("===========================");

        Cat  cc = (Cat)an;
        System.out.println(cc.age);
        cc.sleep();



    }
}
