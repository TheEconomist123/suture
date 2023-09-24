package com.itheima.demon32;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/9/3 003
 * @time 21:24
 * @desc
 */
public class Cat  extends   Animal{
    public Cat() {
        System.out.println("猫吃饭了。。。。。。。。。。。");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼。。。。。。。。。。。");
    }
}
