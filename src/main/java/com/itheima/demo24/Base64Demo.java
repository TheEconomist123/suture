package com.itheima.demo24;

import java.util.Base64;

public class Base64Demo {

    public static void main(String[] args) {
        String message = "Hello World!"; // 待加密的消息
        String encodedMessage = Base64.getEncoder().encodeToString(message.getBytes()); // 进行加密
        System.out.println("加密后的消息：" + encodedMessage);

        String decodedMessage = new String(Base64.getDecoder().decode(encodedMessage)); // 进行解密
        System.out.println("解密后的消息：" + decodedMessage);
    }

}
