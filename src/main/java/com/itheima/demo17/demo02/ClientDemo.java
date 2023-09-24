package com.itheima.demo17.demo02;


//客户端读键盘录入数据，然后发送到服务端

import java.io.*;
import java.net.Socket;

public class ClientDemo {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.214.1", 10000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        socket.close();
    }
}
