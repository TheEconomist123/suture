package com.itheima.demo29;

import java.util.Calendar;
import java.util.Date;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/6/5
 * @time 18:48
 * @desc 这是jdk7  关于时间的日期类 ，多线程情况下会出现数据安全问题
 */
public class CalendarDemo {
    public static void main(String[] args) {


        //会根据系统不同时区，获取不同日历对象
        Calendar c = Calendar.getInstance();
        //会把当前系统时间里面的纪元，年 ，月，日 星期放在一个数字里面
        System.out.println(c.toString());
        Date date = new Date(0L);

        c.setTime(date);
        System.out.println(c);
        //month 是从0-11  月份
        //1 2 3 4 5 6 7 周日1-周一2 -周二3-周三4-周四5-周五6-周六7

        int year = c.get(1); //年
        int month = c.get(2) + 1;
        int day = c.get(5);
        System.out.println(year + "-" + month + "-" + day);
        System.out.println("-----------------------------------接下来测试calendar中的get功能-------------------");

        Calendar c1 = Calendar.getInstance();
        int i = c1.get(Calendar.YEAR);
        int i1 = c1.get(Calendar.MONTH) + 1;
        int i2 = c1.get(Calendar.DAY_OF_MONTH);
        int i3 = c1.get(Calendar.DAY_OF_WEEK);
        System.out.println("为了做到见名知意-------------------");
        System.out.println(i + "-" + i1 + "-" + i2 + "-" + getWeek(i3));
        System.out.println("----------------------接下来进行测试calendar 的设置功能 set（xxx）---------------------");

        Calendar c3 = Calendar.getInstance();
        System.out.println(c3.toString());
        c3.set(Calendar.YEAR, 2020);
        c3.set(Calendar.MONTH, 9);
        c3.add(Calendar.MONTH, 1);
        c3.add(Calendar.MONTH, -1);
        int j = c3.get(Calendar.YEAR);
        int j1 = c3.get(Calendar.MONTH) + 1;
        int j2 = c3.get(Calendar.DAY_OF_MONTH);
        int j3 = c3.get(Calendar.DAY_OF_WEEK);
        System.out.println(j + "-" + j1 + "-" + j2 + "-" + getWeek(j3));


    }

    //这是查表法
    public static String getWeek(int index) {
        String[] weeks = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return weeks[index];
    }
}
