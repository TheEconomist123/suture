package com.itheima.demo29;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/6/11
 * @time 16:33
 * @desc 这是最全面统计日期时间间隔的  这个比较重要
 */
public class ChronoUnitDemo {
    public static void main(String[] args) {


        LocalDateTime of = LocalDateTime.of(1994, 3, 18, 0, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.YEARS.between(of, now));//相差年
        System.out.println(ChronoUnit.MONTHS.between(of, now));
        System.out.println(ChronoUnit.DAYS.between(of, now));
        System.out.println(ChronoUnit.WEEKS.between(of, now));
        System.out.println(ChronoUnit.HOURS.between(of, now));
        System.out.println(ChronoUnit.MINUTES.between(of, now));
        System.out.println(ChronoUnit.SECONDS.between(of, now));//相差年
        System.out.println(ChronoUnit.MILLIS.between(of, now));
        System.out.println(ChronoUnit.MICROS.between(of, now));//微妙
        System.out.println(ChronoUnit.NANOS.between(of, now));
        System.out.println(ChronoUnit.HALF_DAYS.between(of, now));//相差半天数量
        System.out.println(ChronoUnit.ERAS.between(of, now));//相差纪元
        System.out.println(ChronoUnit.CENTURIES.between(of, now));//相差世纪
        System.out.println(ChronoUnit.MILLENNIA.between(of, now));//相差千年数量

        LocalDateTime now1 = LocalDateTime.now();

        System.out.println(now1);

    }
}
