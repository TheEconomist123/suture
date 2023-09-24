package com.itheima.demo13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExceptionDemo {

    public static void main(String[] args) {

        //针对异常处理的几种常见操作方式


        //  method1();
        method2();


    }

    private static void method2() {

        try (FileReader fr = new FileReader("fr.txt");
             FileWriter fw = new FileWriter("fw1.txt")) {
            int len;
            char[] chars = new char[1024];
            while ((len = fr.read(chars)) != -1) {
                fw.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void method1() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("fr.txt");
            fw = new FileWriter("fw.txt");
            int len;
            char[] chars = new char[1024];
            while ((len = fr.read(chars)) != -1) {
                fw.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
