package com.itheima.demo06;

public class MaoPaoT {

    public static void main(String[] args) {

        int[] arr = {2, 3, 513, 5, 0, 34, 345};

        //组装排序
        System.out.println("排序前:"+assemArr(arr));
        //进行排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }
            }

        }
        //组装排序
        System.out.println("排序后:"+assemArr(arr));
    }

    private static String assemArr(int[] arr) {
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
