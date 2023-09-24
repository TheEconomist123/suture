package com.itheima.demo17.demo03;

import java.io.*;
import java.net.Socket;

public class ClientDemo {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("192.168.142.1",10000);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("e:\\123.txt")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String  len;
        while((len=br.readLine())!=null){
            bw.write(len);
            bw.newLine();
            bw.flush();

        }
        socket.close();
        br.close();


    }
}
