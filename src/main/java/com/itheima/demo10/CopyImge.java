package com.itheima.demo10;

import java.io.*;

public class CopyImge {

    public static void main(String[] args) throws IOException {


         method1();//19705

       // method2();//34261

    }

    private static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\迅雷下载\\战士第二季\\阳光电影www.ygdy8.com.战士第二季第08集中英双字.mkv");
        FileOutputStream fos = new FileOutputStream("E:\\2.mkv");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        long start = System.currentTimeMillis();
        int len;
        byte[] bys = new byte[1024];
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bis.close();
        bos.close();
        long end = System.currentTimeMillis();
        System.out.println("elapsed-time:" + (end - start));

    }

    private static void method1() throws IOException {

        FileInputStream fis = new FileInputStream("D:\\迅雷下载\\战士第二季\\阳光电影www.ygdy8.com.战士第二季第08集中英双字.mkv");
        FileOutputStream fos = new FileOutputStream("E:\\2.mkv");

        long start = System.currentTimeMillis();

        int len;
        byte[] bys = new byte[1024];
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fis.close();
        fos.close();
        long end = System.currentTimeMillis();

        System.out.println("elapsed-time:" + (end - start));

    }


}
