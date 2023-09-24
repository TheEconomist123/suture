package com.itheima.demo06;

import sun.misc.Cleaner;

import java.util.Calendar;

public class DateDemo {
    public static void main(String[] args) {


        Calendar c = Calendar.getInstance();//多态形式，返回的是子类对象。
        c.add(Calendar.YEAR,-10);
        c.add(Calendar.DATE,-5);
        int date =c.get(Calendar.DATE);
        int month=c.get(Calendar.MONTH)+1;
        int year=c.get(Calendar.YEAR);
        System.out.println(year+"-"+month+"-"+date);

        System.out.println("-------------------二月天------------------------");
        c.set(2008,2,1);
        c.add(Calendar.DATE,-1);
        System.out.println(c.get(Calendar.DATE));


    }
}
