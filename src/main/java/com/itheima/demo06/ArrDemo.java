package com.itheima.demo06;


import java.util.Arrays;

public class ArrDemo {


    public static void main(String[] args) {

        int[] arr = {213, 55, 68, 9, 235, 8235, 0};
        System.out.println("排序前:" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后:" + Arrays.toString(arr));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //int --String

        int num=100;
        System.out.println("num = " + num);
        String  str=""+num;
        

        System.out.println("str = " + str);

        System.out.println(String.valueOf(num));


        String   s1="20000";

        Integer integer = Integer.valueOf(s1);
        System.out.println(integer.intValue());

        int i = Integer.parseInt(s1);
        System.out.println("i = " + i);


    }
}
