package com.itheima.demo28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/31
 * @time 9:05
 * @desc 结合正则来演示爬虫技术
 */
public class PythonDemo {


    public static void main(String[] args) throws IOException {
        String str = "Java 自从95年问世以来，经历许多版本，目前企业用的最多的是Java8 和 Java11，因为这两个长期支持版本，下一个" +
                "长期支持版本是Java17，相信在不久的未来Java17也会逐渐登上历史舞台";

        //Pattern:表示正则表达式
        //Matcher：文本匹配，作用按照正则表达式的规则去匹配读取字符串从头开始读取
        //在大串中去匹配子串
        Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher m = p.matcher(str);
   /*     boolean b = m.find();
        String s= m.group();
        System.out.println(s);*/

        while (m.find()) {
            System.out.println(m.group());
        }

        System.out.println("-------------------进行简单的爬虫网页演示------------------------");

        URL url = new URL("https://m.thepaper.cn/baijiahao_23289723");

        URLConnection urlConn = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));

        String regex = "([1-9]\\d{17})|(姓名：.{2,3}|(执行标的：.{0,6}元))";
        Pattern compile = Pattern.compile(regex);
        String line;
        while ((line = br.readLine()) != null) {
            Matcher matcher = compile.matcher(line);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }

        br.close();
    }
}
