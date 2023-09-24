package com.itheima.demo24;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/2/18
 * @time 11:51
 * @desc 测试 两个变量互相交换值
 */
public class YIHUODemo {

    public static void main(String[] args) {

        //第一种
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:" + a + "b:" + b);
        //第二种
        int x = 10;
        int y = 20;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("x:" + x + "y:" + y);
        //第三种
        int i = 10;
        int j = 20;
        i = i + j;
        j = i - j;
        i = i - j;

        System.out.println("i:" + i + "j:" + j);

      /*  因为异或有以下的特点：
        一个数与0异或等于它本身：a ^ 0 = a
        一个数与另一个数异或两次等于这个数本身：(a ^b) ^b = a
        */


    }


    void interChangeStr01() {
        String str1 = "Hello";
        String str2 = "World";
        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("str1:" + str1 + "str2:" + str2);


    }

    void interChangeStr02() {
        String str1 = "Hello";
        String str2 = "World";
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(str2);
        str1 = sb.substring(str2.length());
        str2 = sb.substring(0, str1.length());
        System.out.println("str1:" + str1 + "str2:" + str2);
    }




}
