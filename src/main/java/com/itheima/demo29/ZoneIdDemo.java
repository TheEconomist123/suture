package com.itheima.demo29;

import java.time.ZoneId;
import java.util.Set;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/6/5
 * @time 22:15
 * @desc jdk8 常用时间相关类  ZoneId  Instant ZoneDateTime
 */
public class ZoneIdDemo {
    public static void main(String[] args) {


        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for (String zoneId : zoneIds) {
            System.out.println(zoneId);
        }
        System.out.println(zoneIds.size());

        System.out.println("获取系统默认时区---------------------");
        System.out.println(ZoneId.systemDefault());

        ZoneId of = ZoneId.of("Asia/Singapore");
        System.out.println(of);


    }
}
