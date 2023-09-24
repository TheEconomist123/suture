package com.itheima.demo29;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/6/11
 * @time 16:20
 * @desc侧重点是时间间隔
 */
public class DurationDemo {
    public static void main(String[] args) {

        LocalDateTime of = LocalDateTime.of(1994, 3, 18, 12,20, 40);
        LocalDateTime now = LocalDateTime.now();
        Duration d = Duration.between(of, now);
        //相差的天数到纳秒
        System.out.println(d.toDays());
        System.out.println(d.toHours());
        System.out.println(d.toMinutes());
        System.out.println(d.toMillis());
        System.out.println(d.toNanos());




    }
}
