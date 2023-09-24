package com.itheima.demo10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CharWriterDemo {

    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e:\\222.txt"));
        for (int i = 30; i < 126; i++) {
            osw.write(i);
            osw.flush();
        }
        osw.close();


    }
}
