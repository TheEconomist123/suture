package com.itheima.demo11;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CallTheRoll {

    public static void main(String[] args) throws IOException {

             //从已知文件获取数据放入到集合中。
        InputStreamReader gbk = new InputStreamReader(new FileInputStream("e:\\random.txt"), "UTF-8");


        BufferedReader br = new BufferedReader(gbk);


        ArrayList<String> arrayList = new ArrayList<>();

        String len;
        while((len=br.readLine())!=null){
            arrayList.add(len);
        }
        br.close();
        Random random = new Random();
        int i = random.nextInt(arrayList.size());

        System.out.println("获得幸运儿是："+arrayList.get(i));


    }
}
