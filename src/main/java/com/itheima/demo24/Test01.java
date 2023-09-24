package com.itheima.demo24;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/2/24
 * @time 16:19
 * @desc
 */
public class Test01 {

    public static void main(String[] args) {
       /* String  str="0";
        String   ss=str.equals("0")?"000000":str;
        System.out.println(ss);
        */
        String inputString = ""; // 假设这是你要截取的字符串
        int maxLength = 10; // 限制最大长度为1000个字符
        String outputString = inputString.substring(0, Math.min(inputString.length(), maxLength)); // 截取字符串并限制最大长度为1000个字符
        System.out.println(outputString);


    }
}
