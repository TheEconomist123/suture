package com.itheima.demo;

public class Test05 {

    public static void main(String[] args) {
        //统计数量
        String str = "afha245bFH1TTT2hf";
        int bigW = 0;
        int smallW = 0;
        int number = 0;
        char zero = '0';
        System.out.println(zero + 0);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch <= 'Z' && ch >= 'A') {
                bigW++;
            } else if (ch <= 'z' && ch >= 'a') {
                smallW++;
            } else if (ch <= '9' && ch >= '0') {
                number++;
            }
        }
        System.out.println("大写字母：" + bigW + "   小写字母：" + smallW + "  数字：" + number);
        //拼接int数组
        // jointIntArr();
        //字符串反转
        strReverse();
    }

    private static void strReverse() {

        String str = "agfab134";
        String s = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            s += str.charAt(i);
        }

        System.out.println("s = " + s);

    }

    private static void jointIntArr() {

        int[] arr = {1, 24, 5, 6};

        String str = "";
        str += "[";

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i];
            } else {
                str += arr[i] + ",";
            }

        }

        str += "]";

        System.out.println("str = " + str);

    }


}
