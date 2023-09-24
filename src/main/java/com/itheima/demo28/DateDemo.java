package com.itheima.demo28;

import java.util.Date;
import java.util.Random;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/31
 * @time 21:08
 * @desc
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(0L);
        System.out.println(date1);
        date1.setTime(1000L);
        System.out.println(date1);
        System.out.println(date.getTime());
        System.out.println("----------------------------------------");


        // 打印时间原点一年以后时间
        Date date2 = new Date(0L);

         Long time =date2.getTime();
         time=time+1000L*60*60*24*365;
         date2.setTime(time);
        System.out.println(date2);

        System.out.println("-----------------比较两个人日期大小-------------");

        Random random = new Random();
        Date date3 = new Date(Math.abs(random.nextInt()));
        Date date4 = new Date(Math.abs(random.nextInt()));

        System.out.println(date3.getTime()-date4.getTime());


    }
}
