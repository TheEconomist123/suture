package com.itheima.demo28;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/31
 * @time 20:49
 * @desc
 */
public class RegexDemo04 {
    public static void main(String[] args) {

        String   str ="我要学学编编编程程程";
         //regex 内容解析： (.) 把重复内容第一次字符看看成一组
        // \\1 表示第一个字符出现次数
       //+ 至少一次 如果括号里面出现非捕本组(?: ?! ?=)  将无法使用\\1 y


        System.out.println(str.replaceAll("(.)\\1+", "$1"));

    }
}
