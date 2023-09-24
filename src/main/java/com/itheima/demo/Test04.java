package com.itheima.demo;

/**
 * @description:
 * @Author:zzz
 * @Date：2022/2/1217:06
 */
public class Test04 {
    public static void main(String[] args) {

        String str = new String();
        System.out.println("str = " + str);
        char[] chars = {'a', 'b', 'c', '3'};
        String str1 = new String(chars);
        System.out.println("str1 = " + str1);
        byte[] bys = {97, 98, 99, 100, 101};
        String str2 = new String(bys);
        System.out.println("str2 = " + str2);

        String str3 = "awrwra";
        System.out.println("str3 = " + str3);

        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2);
        //---------------------------------------------------------


        /*
         * == 基础数据：比较的的数据值
         * ==  引用数据类比较的是 地址值。
         * 字符串对象 比较内容的  用equals()
         * */
        //遍历字符串
        String strIt = "安抚撒开发板卡133*3";

        System.out.print("[");
        for (int i = 0; i < strIt.length(); i++) {
            char c = strIt.charAt(i);

            if (i == strIt.length()-1) {
                System.out.print(c);
            } else {
                System.out.print(c + ",");
            }

        }
        System.out.println("]");


    }
}
