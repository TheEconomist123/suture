package com.itheima.demo28;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/27
 * @time 22:52
 * @desc
 */
public class StringDemo {
    public static void main(String[] args) {
/*
        String str=null;
        System.out.println(str.toString());
*/
        //String 类常用方法
        String  str1="我是一个普通民众-[人物传记]一";
        //1.长度
        System.out.println(str1.length());
        System.out.println("---------------------1------------------");
       //2.获取对应字符
        System.out.println(str1.charAt(2));
        System.out.println("---------------------2------------------");
        //3.转换成字符数组
        char[] chars = str1.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);

        }
        System.out.println("---------------------3------------------");
        //4.获取字符位置，不存在说明不存在

        System.out.println(str1.indexOf("一"));
        System.out.println(str1.lastIndexOf("一"));
        System.out.println(str1.indexOf("一", 1));
        System.out.println("---------------------4------------------");

        String  str2="Why diy you put a pink bow on a baby ?";
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println("---------------------5------------------");
        String  str3="He jogs every day。He runs every day。He skips sometimes。";
        String[] split = str3.split("。");
        System.out.println(split.length);
        for (String s : split) {
            System.out.println(s);
        }
        System.out.println("---------------------6------------------");

        String  s1="我是";
        String  s2="中国";
        String s3=s1+s2;

        String s4 = new String("我是中国");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println("---------------------7------------------");

        String  sub1= "hello.java.";
        System.out.println(sub1.substring(2));
        System.out.println(sub1.substring(5,9));
        System.out.println("---------------------8------------------");
        System.out.println(sub1.contains("."));
        System.out.println(sub1.replace(".", "。").replace("h", "H"));


        //Do you have some time ?
        //你有一些时间吗？
        // I will see  him again  sometime.
        //将来某时候，我会看到他
        // I hava been here some times。
        // 我来过这里几次
        //I sometimes go to school by bus .
        // 我有时候去学校乘坐公交车。




    }
}
