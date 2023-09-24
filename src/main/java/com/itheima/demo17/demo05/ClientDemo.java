package com.itheima.demo17.demo05;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {


        Socket socket = new Socket("192.168.214.1", 10000);

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\zhouz\\Desktop\\tx文档\\linux1命令.txt")));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        socket.shutdownOutput();
        //读取服务端传输数据
        BufferedReader br1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br1.readLine();
        System.out.println("服务端传回数据：" + s);
        br.close();
        socket.close();



    }
}
