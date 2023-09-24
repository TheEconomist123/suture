package com.itheima.demo17;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.214.1", 9527);
        OutputStream os = socket.getOutputStream();
        os.write("我是遵从tcp协议,我来了".getBytes());
        os.close();
    }
}
