package com.itheima.demo10;

import java.io.*;

public class BufferCharDemo {

    public static void main(String[] args) throws IOException {
/*        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\123.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\111.txt"), "gbk");
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);
        int len;
        char[] chs = new char[1024];
        while ((len = br.read(chs)) != -1) {
            bw.write(chs, 0, len);
            System.out.println(new String(chs, 0, len));
        }
        br.close();
        bw.close();*/


        System.out.println("----------------------------------------------------------------");

        FileReader fr = new FileReader("D:\\123.txt");


        FileWriter fw = new FileWriter("E:\\123.txt");

        int len1;
        char[] ch1=new char[1024];

        while((len1=fr.read(ch1))!=-1){

            System.out.println(new String(ch1,0,len1));
            fw.write(ch1,0,len1);


        }


        fr.close();
        fw.close();













    }
}
