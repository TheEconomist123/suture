package com.itheima.demo28;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/27
 * @time 22:12
 * @desc
 */
public class ObjectDemo {
    public static void main(String[] args) {

        Object obj = new Object();
        System.out.println(obj.toString());

        String  s1="123";
        StringBuilder sb  = new StringBuilder("123");
        System.out.println(s1.equals(sb));
        System.out.println(sb.equals(s1));



    }
}
