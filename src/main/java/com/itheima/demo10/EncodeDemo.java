package com.itheima.demo10;

import java.io.*;

public class EncodeDemo {
    public static void main(String[] args) throws IOException {


        System.out.println((char)-120);
        System.out.println(System.getProperty("file.encoding"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\111.txt"),"gbk");
        int len;
         while ((len=isr.read())!=-1){
             System.out.print((char) len+"  "+len+"\n\r");
         }

         isr.close();
    }
}
