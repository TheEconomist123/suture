package com.itheima.demo17.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12345);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        System.out.println("接受客户端数据:" + new String(bys, 0, len));

        //给出反馈
        OutputStream os = accept.getOutputStream();
        os.write("数据已经收到了".getBytes());

        ss.close();
    }
}
