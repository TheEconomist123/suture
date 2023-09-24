package com.itheima.demo28;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/30
 * @time 11:24
 * @desc
 */
public class RegexDemo {
    public static void main(String[] args) {


        String  regex="1[3-9]\\d{9}";
        System.out.println("123456789012".matches(regex));


        String mailRegx="\\w+@[\\w+&&[^_]]{2,10}\\.([a-zA-Z]{2,3}){1,2}";

        System.out.println("2248869976@qq.com".matches(mailRegx));
        //在开发中很少自己写正则表达式
        //才用ang-rule 插件实现正则的使用
        // 24小时表达式写法
        // 23:11:23
         // 01 02 03 ... 09
        // 10 11 12 13... 19
        // 20 21 22 23


         String twentyFourRegex="([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
         String twentyFour="([01]\\d|2[0-3])(:[0-5]\\d){2}";
        System.out.println("23:11:34".matches(twentyFourRegex));
        //练习题目
        //校验身份证 前17位是数字，最后一位是x X 或者是数字

        String idNoRegx="[1-9]\\d{16}(x|X|\\d)";
        //另外一种写法是
        String idNoRegx1="[1-9]\\d{16}[xX\\d]";
        //忽略大小写

        System.out.println("-------------------------------------");
        //忽略abc大小写
        String  ig="((?i)abc).*";
        //忽略b的大小写
        String  ig1="a((?i)b)c";

        System.out.println("Abcdq2rqwrqwrwq".matches(ig));

    }
}
