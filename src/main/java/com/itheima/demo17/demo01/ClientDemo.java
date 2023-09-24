package com.itheima.demo17.demo01;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//发送数据，并接受服务器端反馈
public class ClientDemo {

    public static void main(String[] args) throws IOException {
        //向服务端发送数据
        Socket ss = new Socket("192.168.214.1", 12345);
        OutputStream os = ss.getOutputStream();
        os.write("我遵守tcp协议，收到请回答".getBytes());
        //接受服务端反馈数据
        InputStream is = ss.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);

        System.out.println("接受服务端数据:" + data);

        ss.close();


    }
}
