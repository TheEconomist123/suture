package com.itheima.demo26;

import com.itheima.demo10.FileDemo;

import java.io.*;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/3/27
 * @time 10:35
 * @desc 常见io测试
 */
public class FileDemo01 {
    public static void main(String[] args) {

         long  start =System.currentTimeMillis();

        String sourceFile = "D:\\迅雷下载\\阳光电影.m.ygdy8.com.行骗高手.2023.BD.1080P.中英双字.mkv";
        String destinationFile = "行骗高手.mkv";
        try {
            FileInputStream fileInputStream = new FileInputStream(sourceFile);
            FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, bytesRead);

            }
            fileInputStream.close();
            fileOutputStream.close();
            long  end =System.currentTimeMillis();
            System.out.println("file copied successfully ! 耗时："+(end-start)/1000+"s");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
