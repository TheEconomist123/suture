package com.itheima.demo07;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {


        Set<String> set = new HashSet<String>();

        set.add("hello");
        set.add("hello1");
        set.add("hello2");
        set.add("通话");
        set.add("重地");


        for (String s : set) {
            System.out.println(s);

        }

        System.out.println("---------------------");

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());


    }
}
