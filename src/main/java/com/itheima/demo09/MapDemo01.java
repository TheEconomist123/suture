package com.itheima.demo09;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo01 {

    public static void main(String[] args) {


        String  str="这是一首简单的小情歌0123.Aa";

        Map<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i <str.length(); i++) {
            char c = str.charAt(i);
         //   System.out.println(c);
            hm.put(c,Integer.valueOf(c));
        }


        System.out.println(hm);
        int[]  arr={2,2,3,44};

        List<int[]> ints = Arrays.asList(arr);


    }
}
