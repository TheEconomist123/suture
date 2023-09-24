package com.itheima.demo13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo01 {

    public static void main(String[] args) throws IOException {

      //  store();
        //
        load();
    }

    private static void load() throws IOException {
        Properties pro = new Properties();
        FileReader fr = new FileReader("e:\\123.txt");

        pro.load(fr);
        fr.close();
        System.out.println(pro);

    }

    private static void store() throws IOException {
        Properties pro = new Properties();
        pro.put("黄晓明", "杨颖");
        pro.put("罗晋", "唐嫣");
        pro.put("张若昀", "唐艺昕");
        pro.put("邓超", "孙俪");
        FileWriter fw = new FileWriter("e:\\123.txt");
        pro.store(fw, null);
        fw.close();
    }
}
