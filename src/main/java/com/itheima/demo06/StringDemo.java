package com.itheima.demo06;

import java.util.Arrays;

public class StringDemo {

    public static void main(String[] args) {

        String str = "32 55 24 1255 615 1252 0 33 ";

        String[] s = str.split(" ");
        int[] arr = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + " ");
            }
        }

        System.out.println(sb.toString());


    }
}
