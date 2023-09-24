package com.itheima.demo17.demo05;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);

        while (true) {
            //监听客户端连接,返回一个对应的socket对象
            Socket socket = serverSocket.accept();
            new Thread(new ServerThread(socket)).start();
        }
    }
}
