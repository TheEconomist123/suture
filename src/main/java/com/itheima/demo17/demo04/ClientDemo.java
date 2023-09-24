package com.itheima.demo17.demo04;

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
        //自定义结束标记
   /*     bw.write("886");
        bw.newLine();
        bw.flush();*/
        socket.shutdownOutput();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String data = bufferedReader.readLine();
        System.out.println("接受服务端反馈数据信息:" + data);
        socket.close();
        bw.close();
        bufferedReader.close();


    }
}
