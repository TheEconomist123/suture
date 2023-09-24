package com.itheima.demo17.demo23;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/1/10
 * @time 15:03
 * @desc
 */
public class Test02 {

    public static void main(String[] args) {
        
        
        
        String  str="1,2,4,5,,34,,58,,";
        String[] split = str.split(",", 10);

        for (String s : split) {
            System.out.println("s = " + s);
        }
    }
}
