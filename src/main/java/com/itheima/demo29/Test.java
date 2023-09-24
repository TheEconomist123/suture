package com.itheima.demo29;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/6/8
 * @time 11:24
 * @desc
 */
public class Test {
    public static void main(String[] args) {
        ZonedDateTime zdt = Instant.now().atZone(ZoneId.of(ZoneId.systemDefault().getId()));
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyyMMdd HHmmss SSS");



        System.out.println(zdt.format(dtf1));

        for (int i = 10000; i > 0; i--) {
            String substring = UUID.randomUUID().toString().replace("-", "").substring(0, 18);
            System.out.println(substring);

        }

    }
}
