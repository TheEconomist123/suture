package com.itheima.demo13;

import java.io.*;

public class CharCopyAdvDemo {

    public static void main(String[] args) throws IOException {

      //  BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\文件存放\\DB2错误码与错误说明一览表.txt"), "gbk"));
        BufferedReader br = new BufferedReader(new FileReader("D:\\文件存放\\DB2错误码与错误说明一览表.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("d:\\db2错误表.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            pw.println(line);
        }
        br.close();
        pw.close();


    }
}



