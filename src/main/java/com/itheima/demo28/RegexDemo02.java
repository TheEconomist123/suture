package com.itheima.demo28;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/31
 * @time 17:17
 * @desc  正则切割，正则替换
 */
public class RegexDemo02 {
    public static void main(String[] args) {

         String str1="小诗诗gdasgfasgag12312小丹丹qwrqwrqqrt12312小慧慧";
         // 要求 把字符串中的三个姓名之间字母替换成vs
        //把字符中的三个姓名切割出来

        String vs = str1.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(vs);

        String[] split = str1.split("[\\w&&[^_]]+");

        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }


    }
}
