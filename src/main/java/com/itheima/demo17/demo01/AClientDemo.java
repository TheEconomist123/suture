package com.itheima.demo17.demo01;

import java.io.*;
import java.net.Socket;

//实现键盘录入功能的客户端录入
public class AClientDemo {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.214.1", 10000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();

    }
}
