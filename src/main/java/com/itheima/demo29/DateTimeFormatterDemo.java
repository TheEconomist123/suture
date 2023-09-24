package com.itheima.demo29;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/6/11
 * @time 11:55
 * @desc
 */
public class DateTimeFormatterDemo {
    public static void main(String[] args) {


       //1.指定时区，获取当前时间对象
        ZonedDateTime zdt = Instant.now().atZone(ZoneId.of(ZoneId.systemDefault().getId()));
        //2.建立格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS EE a");
        System.out.println(dtf.format(zdt));
        System.out.println(dtf1.format(zdt));

        System.out.println(Long.MAX_VALUE);



    }
}
