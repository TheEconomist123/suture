package com.itheima.demo17;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class UdpSend {
    public static void main(String[] args) throws IOException {


        DatagramSocket ds = new DatagramSocket();

        byte[]  bys="hello 我是udp".getBytes();


        DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.214.1"),10086);

        ds.send(dp);

        ds.close();



    }
}
