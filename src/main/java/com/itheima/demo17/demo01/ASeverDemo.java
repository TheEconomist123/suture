package com.itheima.demo17.demo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ASeverDemo {

    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(10000);
        Socket accept = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println("接受客户端数据："+line);
        }

        ss.close();
    }
}
