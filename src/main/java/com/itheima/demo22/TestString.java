package com.itheima.demo22;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/1/10
 * @time 8:59
 * @desc
 */
public class TestString {

    public static void main(String[] args) {
        String  str1="1,2,,5,1,2";
        String[] split = str1.split(",");

        for (String s : split) {

            System.out.println("数据是:"+s);

        }
    }
}
