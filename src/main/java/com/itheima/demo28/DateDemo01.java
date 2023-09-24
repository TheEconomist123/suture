package com.itheima.demo28;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/31
 * @time 21:26
 * @desc
 */
public class DateDemo01 {
    public static void main(String[] args) throws ParseException {

/*

        SimpleDateFormat sdf = new SimpleDateFormat();
        String format = sdf.format(new Date(0L));
        System.out.println(format);

*/


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //这个真只能小于解析长度
        String format = sdf.format(new Date());
        System.out.println(format);


        System.out.println("----------------------------------------------");

        String dateStr="2023-09-22 23:11:11";

        Date parse = sdf.parse(dateStr);
        System.out.println(parse.getTime());






    }
}
