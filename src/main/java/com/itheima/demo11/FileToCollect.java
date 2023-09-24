package com.itheima.demo11;

import java.io.*;
import java.util.ArrayList;

public class FileToCollect {


    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\123.txt"), "gbk");
        BufferedReader br = new BufferedReader(isr);
        ArrayList<String> list = new ArrayList<String>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }


        System.out.println("行数："+list.size());
        for (String s : list) {
            System.out.println(s);
        }


    }
}
