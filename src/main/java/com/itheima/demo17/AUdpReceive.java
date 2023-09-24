package com.itheima.demo17;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class AUdpReceive {

    public static void main(String[] args) throws IOException {

        //创建socket接收端对象
        DatagramSocket ds = new DatagramSocket(12345);

        while (true) {

            //创建数据包裹
            byte[] bys = new byte[1024];

            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            ds.receive(dp);

            System.out.println("接收到的数据是：" + new String(dp.getData(), 0, dp.getLength()));
        }

        //关闭流
        //ds.close();


    }
}
