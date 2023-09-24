package com.itheima.demo29;

import java.util.Scanner;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/6/11
 * @time 23:36
 * @desc
 */
public class IntegerDemo {
    public static void main(String[] args) {

     /*   Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数----------------");
        int i = scanner.nextInt();
        System.out.println(i);
        */
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一字符----------------");
        String  i = scanner.next();//这种遇到空格，制表符，回车就会停止
        System.out.println(i);*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一字符----------------");
        String  i = scanner.nextLine();//以后不管遇到什么数据类型都用这个
        System.out.println(i);

    }
}
