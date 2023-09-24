package com.itheima.demo24;

import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {
        String plainText = "Hello, World!";
        byte[] data = plainText.getBytes();
        
        // encode
        String base64Text = Base64.getEncoder().encodeToString(data);
        System.out.println("Encoded string length: " + base64Text.length());
        
        // decode
        byte[] decodedData = Base64.getDecoder().decode(base64Text);
        System.out.println("Decoded data length: " + decodedData.length);

    }
}
