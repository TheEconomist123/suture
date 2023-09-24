package com.itheima.demo13;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {


        Properties pro = new Properties();
        pro.put("黄晓明1", "杨颖");
        pro.put("罗晋", "唐嫣");
        pro.put("张若昀2", "唐艺昕");
        pro.put("邓超", "黄晓明");
        Set<Object> objects = pro.keySet();
        for (Object object : objects) {
            Object value = pro.get(object);
            System.out.println("key:" + object + "---value：" + value);
        }
        System.out.println("--------------------------");
        Properties pro1 = new Properties();
        pro1.setProperty("itcat001","001");
        pro1.setProperty("itcat002","002");
        pro1.setProperty("itcat003","003");
        pro1.setProperty("itcat004","004");
        Set<String> set = pro1.stringPropertyNames();
        for (String s : set) {
            Object o = pro1.get(s);
            System.out.println(s+"-----"+o);
        }



    }
}
