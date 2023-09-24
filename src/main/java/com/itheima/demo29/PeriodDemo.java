package com.itheima.demo29;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/6/11
 * @time 16:20
 * @desc 计算年月日时间间隔
 */
public class PeriodDemo {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate birth = LocalDate.of(1994, 3, 18);
        //时间间隔对象
        Period between = Period.between(birth, now);
        System.out.println(between.getYears()+"-----"+between.getMonths()+ "----"+between.getDays());

        System.out.println(between.toTotalMonths());


    }
}
