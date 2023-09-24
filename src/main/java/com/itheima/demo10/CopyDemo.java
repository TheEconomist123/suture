package com.itheima.demo10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {

    public static void main(String[] args) throws IOException {

        //1.复制文本文件
        FileInputStream fis = new FileInputStream("C:\\Users\\zhouz\\Desktop\\tx文档\\linux1命令.txt");
        FileOutputStream fos = new FileOutputStream("e:\\123.txt");
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fis.close();
        fos.close();

        System.out.println("执行结束。。。");

    }
}
