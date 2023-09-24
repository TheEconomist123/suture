package com.itheima.demo;

/**
 * @description:
 * @Author:zzz
 * @Date：2022/2/1010:11
 */
public class Test03 {
    public static void main(String[] args) {
       /* for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 7 == 7 || i / 10 % 7 == 7) {
                System.out.println(i);
            }
        }*/
       // noDeadRabbit();
        //arrSum();
    //  boolean flag=  compareArr();
         convertArr();
    }

    private static void convertArr() {
        //用来颠倒数数组顺序
        int[] arr={22,33,204,671,88,144};
        for (int start = 0, end=arr.length-1; start <=end ; start++,end--) {


            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+",");
        }

    }

    private static boolean compareArr() {

        int[] arr1={11,22,33,44,55};
        int[] arr2={11,22,33,44,55};

        if(arr1.length!=arr2.length){
            return false;
        }
        for (int i = 0; i <arr1.length ; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void noDeadRabbit() {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[19]);

    }

    public static void arrSum() {

        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 != 7 && arr[i] / 10 % 10 != 7 && arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("sum = " + sum);


    }





}
