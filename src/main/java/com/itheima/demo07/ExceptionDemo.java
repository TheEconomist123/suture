package com.itheima.demo07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {

    public static void main(String[] args) {

        String date = "2022-02-26";
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS ");
        System.out.println(sdf.format(date1));
        Date parse = null;
        try {
            parse = sdf.parse(date);
            System.out.println(parse.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("start");
        method();
        System.out.println("end");
    }

    public static void method() {

        try {
            int[] arr = {2, 35, 6};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //  e.printStackTrace();
            //    System.out.println(e.getMessage());
            //System.out.println(e.toString());
        }


    }
}
