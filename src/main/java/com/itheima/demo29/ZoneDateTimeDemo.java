package com.itheima.demo29;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/6/5
 * @time 22:47
 * @desc
 */
public class ZoneDateTimeDemo {
    public static void main(String[] args) {

        System.out.println(ZonedDateTime.now());
        //获取指定时间
        ZonedDateTime zd = ZonedDateTime.of(2023, 11, 11, 11, 11, 11, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(zd);

        Instant instant = Instant.ofEpochMilli(0L);
        ZoneId of1 = ZoneId.of("US/Pacific");
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, of1);
        System.out.println(zonedDateTime);
        System.out.println(ZonedDateTime.ofInstant(instant, of1));
        System.out.println("修改时间----------------------------");

        System.out.println(zonedDateTime.withYear(2018));
        System.out.println(zonedDateTime.withMonth(10));
        System.out.println(zonedDateTime.minusYears(1));
        System.out.println("--------------------parting line ---------------------");
        ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.now(),ZoneId.of(ZoneId.systemDefault().getId()));

        System.out.println(zdt);
        System.out.println(zdt.withYear(2013));
        System.out.println(zdt.minusYears(1));
        System.out.println(zdt.plusDays(2));

        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime zonedDateTime1 = now.withYear(2000);
        System.out.println(zonedDateTime1 == now);
        System.out.println(zonedDateTime1.equals(now));


    }
}
