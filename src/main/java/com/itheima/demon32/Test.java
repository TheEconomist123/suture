package com.itheima.demon32;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/9/3 003
 * @time 9:06
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();

        fu.eat();
        System.out.println("--------------1111--------------");

        Fu f1=new  Zi();
        f1.eat();
        System.out.println(f1.num);
        System.out.println("---------------------------------");
        Zi zi = new Zi();
        zi.method();
        System.out.println("---------------------------------");
        Zi zi1 = new Zi();
        zi1.eat();
        zi1.showNum();
        Fu.show1();
        zi1.show1();
    }
}
