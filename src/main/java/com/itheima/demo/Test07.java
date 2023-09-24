package com.itheima.demo;

import java.util.ArrayList;

public class Test07 {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();
        str.add("hello1");
        str.add("hello");
        str.add("hello1");
        str.add("hello1");
        System.out.println(str.remove("hello"));
        System.out.println(str);
        System.out.println("==========================");
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("李四");
        str1.add("小明");
        str1.add("张强");
        for (int i = 0; i <str1.size() ; i++) {
            System.out.println(str1.get(i));
        }

        //继承时候成员变量的访问特点是 ，现在局部范围找，然后在成员内找，接着在父类中找。

    }
}
