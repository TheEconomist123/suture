package com.itheima.demo06;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {1100, 2, 56, 34, 772, 246};
        System.out.println("排序前：" + arrToString(arr));
        for (int x = 0; x < arr.length - 1; x++) {
            for (int i = 0; i < arr.length - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("排序前：" + arrToString(arr));
    }

    private static String arrToString(int[] arr) {

        String str = "[";
        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                str += arr[i];
            } else {
                str += arr[i] + ",";
            }
        }
        str += "]";

        return str;
    }


}
