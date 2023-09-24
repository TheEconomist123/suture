package com.itheima.demo17.demo05;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {

    private Socket socket;

    public ServerThread(Socket accept) {
        this.socket = accept;
    }

    @Override
    public void run() {
        //接受数据文本
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            int count=0;
            File file = new File("E:\\copy"+count+".txt");
            while(file.exists()){
                count++;
                file = new File("E:\\copy"+count+".txt");
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //发出反馈
            BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw1.write("上传文件成功！");
            bw1.newLine();
            bw1.flush();
            //释放资源
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
