package com.itheima.demo17.demo03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

    public static void main(String[] args) throws IOException {


        ServerSocket ss = new ServerSocket(10000);
        Socket accept = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("e:\\321.txt")));

        String line;

        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        ss.close();
        bw.close();


    }
}
