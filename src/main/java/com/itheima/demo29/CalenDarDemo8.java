package com.itheima.demo29;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/6/11
 * @time 15:48
 * @desc
 */
public class CalenDarDemo8 {
    public static void main(String[] args) {


         //获取当前日历时间
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate of = LocalDate.of(1994, 3, 18);
        System.out.println("指定日历对象"+of);

        System.out.println(of.getYear());
        System.out.println(of.getMonth().getValue());
        System.out.println(of.getMonthValue());
        System.out.println(of.getDayOfMonth());
        System.out.println("获取星期。。。。。。。。。。。。。。。");
        System.out.println(now.getDayOfWeek().getValue());
        //is开头是判断的
        System.out.println(now.isBefore(of));
        System.out.println(now.isAfter(of));
        System.out.println("会产生新的日期对象");
        LocalDate with = now.withYear(2000);
        System.out.println(with == now);
        System.out.println("------------------减去日期");
        System.out.println(now.minusYears(1));
        System.out.println("------------------加上日期");
        System.out.println(now.plusYears(1));

        //判断今天是否是你的生日
        LocalDate birthDate = LocalDate.of(1994, 3, 18);
        LocalDate nowDate = LocalDate.now();
        //封装月日对象
        MonthDay birthMd = MonthDay.of(birthDate.getMonthValue(), birthDate.getMonthValue());
        MonthDay nowMd = MonthDay.from(nowDate);
        System.out.println(birthMd.equals(nowMd));
        System.out.println("---------------时分秒 纳秒- 比如秒杀之类-----------");
        //LocatTime 跟之前一样

        LocalTime now1 = LocalTime.now();
        System.out.println(now1);

        System.out.println("可以用年月日时分秒");
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);


    }
}
