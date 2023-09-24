package com.itheima.demo28;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/27
 * @time 15:35
 * @desc
 */
public class SystemDemo {
    public static void main(String[] args) {


        System.exit(1);
        System.out.println(System.currentTimeMillis());
        System.out.println("虚拟机结束了");
        System.out.println("-------------------------------");


        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[12];

        System.arraycopy(arr1, 1, arr2, 0, 7);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ",");
        }


    }
}
