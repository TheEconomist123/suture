package com.itheima.demo29;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/6/5
 * @time 22:30
 * @desc
 */
public class InstantDemo {
    public static void main(String[] args) {

        //这是标准时间
        Instant.ofEpochMilli(new Date().getTime());
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(Instant.ofEpochSecond(1));


        System.out.println(Instant.ofEpochSecond(1, 1000000000));

        System.out.println(Instant.now().atZone(ZoneId.of("Asia/Shanghai")));


        Instant instant = Instant.ofEpochMilli(100L);
        Instant instant2 = Instant.ofEpochMilli(200L);
        //比较时间 前后
        System.out.println(instant.isBefore(instant2));
        System.out.println(instant.isAfter(instant2));
        //从时间原点开始进行加3s
        Instant instant6 = Instant.ofEpochMilli(3000L);
        Instant instant7 = instant6.minusSeconds(2);
        System.out.println(instant7);

        Instant instant1 = Instant.ofEpochMilli(new Date().getTime());
       Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        System.out.println("--------------------------");
        System.out.println(ZoneId.systemDefault().getId());

        System.out.println(instant1);

        System.out.println("重新写一遍东西------------------------");

  /*      Instant instant3 = Instant.ofEpochMilli(new Date().getTime());*/
        System.out.println(Instant.now().atZone(ZoneId.of(ZoneId.systemDefault().getId())));


    }
}
