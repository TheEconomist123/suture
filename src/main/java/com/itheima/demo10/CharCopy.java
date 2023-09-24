package com.itheima.demo10;

import java.io.*;

public class CharCopy {

    public static void main(String[] args) throws IOException {


        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\zhouz\\Desktop\\000.txt"));


        int  len;
        char[]  chr=new char[1024];


        while((len=isr.read(chr))!=-1){

            System.out.println(new String(chr,0,len));

        }
        isr.close();



    }
}
