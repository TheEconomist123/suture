package com.itheima.demo10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CopyDemo01 {

    public static void main(String[] args) throws IOException {


        FileInputStream fis = new FileInputStream("E:\\111.txt");

        byte[]  bys= new byte[5];

        //hello\r\n
        //world\r\n
        //第一次 hello
        //第二次 \r\nwor
        //第三次  ld\r\nr
        int len;
        len=fis.read(bys);
        System.out.println(len);
        System.out.println(new String(bys,0,len));
        len=fis.read(bys);
        System.out.println(new String(bys,0,len));
        len=fis.read(bys);
        System.out.println(new String(bys,0,len));





    }
}
