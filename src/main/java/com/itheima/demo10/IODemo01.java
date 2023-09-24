package com.itheima.demo10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IODemo01 {

    public static void main(String[] args) throws IOException {

      /*  FileOutputStream fos = new FileOutputStream("fos.txt");
        byte[] bytes = "周政之1111".getBytes();
        for (int i = 0; i <10 ; i++) {
            fos.write(bytes, 0, bytes.length);
            fos.write("\n".getBytes());
        }

        fos.close();
*/

        FileInputStream fis = new FileInputStream("fos.txt");
        int by;
        while((by=fis.read())!=-1){
            System.out.print((char)by);
        }
        fis.close();
    }
}
