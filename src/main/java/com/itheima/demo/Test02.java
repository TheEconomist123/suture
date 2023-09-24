package com.itheima.demo;

/**
 * @description:
 * @Author:zzz
 * @Date：2022/2/916:06
 */
public class Test02 {

    public static void main(String[] args) {

        int[] arr={11,292,3,404,455,22};
        System.out.println(arr);
        change(arr);

    }

    private static void change(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.print("]");

    }
}
