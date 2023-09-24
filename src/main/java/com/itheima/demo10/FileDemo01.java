package com.itheima.demo10;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {

    public static void main(String[] args) throws IOException {

        //创建文件，有就返回false  没有就创建。
        File file = new File("e:\\111.txt");
        System.out.println(file.createNewFile());
        //创建文件目录
        File fil1 = new File("e:\\创建文件夹");
        System.out.println(fil1.mkdir());
        //创建多级子目录。
        File fil2 = new File("e:\\创建文件夹\\ccc");
        System.out.println(fil2.mkdirs());




    }
}
