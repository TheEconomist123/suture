package com.itheima.demo;

import sun.security.util.BitArray;

/**
 * @description:
 * @Author:zzz
 * @Date：2022/2/8 10:56
 */
public class Test01 {

    public static void main(String[] args) {

        int[] arrInt = new int[3];
        for (int i = 0; i < arrInt.length; i++) {
            int i1 = arrInt[i];
            System.out.println("i1 = " + i1);

        }
        int[] arr1 = {2, 3, 4};

        for (int i = 0; i < arr1.length; i++) {
            int i1 = arr1[i];
            System.out.println("i1 = " + i1);

        }

        System.out.println("---------------------------");


        int[] maxArr = {2, 35, 67, 81, 0};
        int max = maxArr[0];

        for (int i = 1; i < maxArr.length; i++) {

            if (max < maxArr[i]) {
                max = maxArr[i];
            }

        }

        System.out.println("max = " + max);


    }
}
