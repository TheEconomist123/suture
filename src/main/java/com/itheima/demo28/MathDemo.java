package com.itheima.demo28;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/27
 * @time 15:04
 * @desc
 */
public class MathDemo {
    public static void main(String[] args) {

        System.out.println(Math.abs(-12));
        System.out.println(Math.random());
        //
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648

        for (int i = 0; i <100 ; i++) {
            System.out.println(Math.floor(Math.random() * 100 + 1));

        }

        System.out.println(false);



    }
}
