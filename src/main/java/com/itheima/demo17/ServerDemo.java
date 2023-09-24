package com.itheima.demo17;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

    public static void main(String[] args) throws IOException {


        //在服务端开辟接受客户端请求的 接待窗口为 10000
        ServerSocket ss = new ServerSocket(9527);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();

        byte[] bys = new byte[1024];
        int len = is.read(bys);

        String s = new String(bys, 0, len);

        System.out.println("接受数据是：" + s);
        is.close();
        ss.close();


    }
}
