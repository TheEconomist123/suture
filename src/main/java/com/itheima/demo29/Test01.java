package com.itheima.demo29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/8/30
 * @time 7:36
 * @desc
 */
public class Test01 {
    public static void main(String[] args) {

        List<String> str = new ArrayList<>();
        str.add("a");
        str.add("b");
        str.add("c");
        str.add("d");

        List<String> str1 = new ArrayList<>();
        str1.add("t");
        str1.add("g");
        str1.add("f");
        //说白了就是取交集。
        boolean b = str.retainAll(str1);
       // System.out.println(b);
        for (String s : str1) {
            System.out.println(s);
        }
        //
        System.out.println(str.size());
        HashSet<String> s1 = new HashSet<>();
        System.out.println(s1.add("hello"));
        System.out.println(s1.add("hello"));
        System.out.println(s1.add("world"));

        System.out.println("-----------------------");




    }
}
