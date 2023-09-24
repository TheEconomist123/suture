package com.itheima.demo03;



public class Cat extends Animal {

    public   int  age=100;

//继承抽象类的子类，如果不是抽象类，就要重写抽象类里面所有抽象方法，

    @Override
    public  void eat(){
        System.out.println("猫吃鱼。。。。。。");

    }


/*    public  void  sleep(){
        System.out.println("cat  睡觉");
    }*/


}
