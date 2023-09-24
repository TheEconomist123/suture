package com.itheima.demo10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IODemo {


    public static void main(String[] args) throws IOException {
        //1.调用系统资源创建文件，2.创建文件输出流对象，3.指向文件
        FileOutputStream fos = new FileOutputStream("fos.txt");
        //写入数字
        fos.write(97);
        //关闭输出流释放资源
        fos.close();


    }
}
