package com.itheima.demo11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListToFile {

    public static void main(String[] args) throws IOException {
// 集合到文件
        List<String> list = new ArrayList<String>();
        list.add("沉鱼落涯");
        list.add("闭月羞花");
        list.add("无怨无悔");
        list.add("helloworld");
        list.add("java");
        BufferedWriter bw = new BufferedWriter(new FileWriter("e:\\测试.txt"));

        for (String s : list) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        bw.close();





    }
}
