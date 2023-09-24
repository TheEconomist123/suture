package com.itheima.demo17.demo04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket accept = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\1111.txt")));
        String line;
        while ((line = br.readLine()) != null) {
        /*    if("886".equals(line)){
                break;
            }*/
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw1.write("文件上传成功！");
        bw1.newLine();
        bw1.flush();
        bw1.close();
        ss.close();
        bw.close();


    }
}
