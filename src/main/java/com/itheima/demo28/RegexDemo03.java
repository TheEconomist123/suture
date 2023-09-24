package com.itheima.demo28;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/31
 * @time 17:37
 * @desc
 */
public class RegexDemo03 {
    public static void main(String[] args) {

        //  判断考虑一个字符穿 开始和结束一个字符是否相同
        String str1="2afakfsaksb";
        String regex1="(.).+\\1";
        System.out.println(str1.matches(regex1));
        //判断开始跟结束部分字符是否相等
        String  str2="abcwrfasifabc";
        String  regex2="(.+).+\\1";
        System.out.println(str2.matches(str2));
        String  str3="aaaaigfiasgfaaaa";
        String regex3="((.)\\2*).+\\1";
        //() 这个是用来分组的，第几组，分为( 从左到右进行测试

        System.out.println(str3.matches(regex3));




    }
}
