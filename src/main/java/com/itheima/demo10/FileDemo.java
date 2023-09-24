package com.itheima.demo10;

import java.io.File;

public class FileDemo {

    public static void main(String[] args) {


        File file = new File("D:\\大屏后台代码");

        System.out.println("file = " + file);


        File file1 = new File("D:\\大屏后台代码","eccserver.rar");

        System.out.println("file1 = " + file1);

        File file2 = new File(file, "eccserver.rar");

        System.out.println("file2 = " + file2);


    }
}
