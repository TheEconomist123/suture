package com.itheima.demo28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/31
 * @time 15:10
 * @desc 利用正则进行特性进行获取值
 */
public class PythonDemo01 {
    public static void main(String[] args) {

        String str = "Java5 自从95年问世以来，经历许多版本，目前企业用的最多的是Java8 和 Java11，因为这两个长期支持版本，下一个" +
                "长期支持版本是javA17，相信在不久的未来JAva17也会逐渐登上历史舞台java20";

        //此正则意思为：?前面Java相当参数，?相当于占位符，但是获取值的时候只获取前半部分的Java
        String  regex1="Java(?=8|11|17)";//这=是查询这些后面数字，但是查询时候不显示出来只展示前面。
        String  regex2="((?i)Java)(?=8|11|17)";
        String  regex3="((?i)Java)(8|11|17)";
        String  regex4="((?i)Java)(?:8|11|17)";//这是要拼上后面东西
        String  regex5="((?i)Java)(?!8|11|17)";//这意思是忽略java大小写，但是后面不带那些信东西都要查出来

        Pattern compile = Pattern.compile(regex5);
        Matcher matcher = compile.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
        //?: ?= ?!

        System.out.println("---------------------------------------------");
        //贪婪爬取,非贪婪爬取
        // 只写 + 和 * 表示贪婪爬取
        // +?  *?
            /*
            贪婪爬取：在爬取数据时候尽可能多的爬取数据
            非贪婪爬取：在爬取数据时候尽可能少的获取数据
            */
        String str1 = "Java5 自从95年问世以来，经历许多版本，abbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaa" +
                "目前企业用的最多的是Java8 和 Java11，因为这两个长期支持版本，下一个" +
                "长期支持版本是javA17，相信在不久的未来JAva17也会逐渐登上历史舞台java20";

        /* ab+:
        贪婪爬取：abbbbbbbbbbbbb
        非贪婪爬取：ab
        java 中默认是贪婪爬取 如果在+ 或者 * 加 ? 表示非贪婪爬取、

        * */


         String regexGreed="ab+";
         String regexGreed1="ab+?";

        Pattern compile1 = Pattern.compile(regexGreed1);
        Matcher matcher1 = compile1.matcher(str1);
        while(matcher1.find()){
            System.out.println(matcher1.group());
        }


    }
}
