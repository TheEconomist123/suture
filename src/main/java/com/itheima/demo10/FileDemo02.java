package com.itheima.demo10;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {

/*
        File file = new File("javaDir");
        System.out.println(file.mkdir());

        File file1 = new File("javaDir\\zzz");

        System.out.println(file1.mkdir());*/

        File file2= new File("javaDir");

       /* System.out.println(file2.createNewFile());*/

        System.out.println(file2.delete());





/*

        System.out.println(file.createNewFile());

        System.out.println(file.getAbsoluteFile());
        System.out.println(file.delete());
*/




    }
}
