package com.itheima.demo17;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceive {

    public static void main(String[] args) throws IOException {


        //创建接受对象数据
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);

        ds.receive(dp);

        byte[] data = dp.getData();
        int length = dp.getLength();
        String s = new String(data,0,length);
        System.out.println("数据是：" + s);

        ds.close();
    }
}
