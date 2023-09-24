package com.itheima.demo09;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();
        map.put("李狗蛋","小明");
        map.put("张三","小刚");
        map.put("李四","小红");

        System.out.println(map);
        System.out.println(map.get("111"));

        Set<String> set = map.keySet();
        System.out.println("--------------------------");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("---------------------");
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println("---------------------[1]");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"------"+entry.getValue());
        }
        System.out.println("---------------------[2]");


        Set<String> set1 = map.keySet();

        for (String s : set1) {

            System.out.println(s+"---------------"+map.get(s));

        }


    }
}
