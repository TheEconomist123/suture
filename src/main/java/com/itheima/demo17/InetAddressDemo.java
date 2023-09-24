package com.itheima.demo17;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

    public static void main(String[] args) throws UnknownHostException {


        InetAddress ia = InetAddress.getByName("192.168.214.1");
        System.out.println("主机名称："+ia.getHostName());
        System.out.println("主机地址："+ia.getHostAddress());


    }
}
