package com.itheima.demo10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ImprCopy {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("D:\\Develop\\allCode\\demoT\\src\\main\\java\\com\\itheima\\demo\\Test01.java");

        FileWriter fw = new FileWriter("cpy.java");

        int len;
        char[] chars = new char[1024];
        while ((len = fr.read(chars)) != -1) {
            fw.write(chars, 0, len);
        }

        fr.close();
        fw.close();


    }
}
