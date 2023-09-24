package com.itheima.demo24;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/2/20
 * @time 21:46
 * @desc
 */
public class StrIterationDemo {
    public static void main(String[] args) {


        String   str="Hello world!";


        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);

            System.out.print(" "+c);
        }

        System.out.println();

        for (char c : str.toCharArray()) {

            System.out.print(" "+c);

        }


    }
}
