package com.itheima.demo07;

import java.util.LinkedList;
import java.util.List;

public class CollectDemo4 {
    public static void main(String[] args) {


        List<String> ll= new LinkedList<String>();

        ll.add("hello");
        ll.add("world");
        ll.add("java");

        for (int i = 0; i <ll.size() ; i++) {
            if(ll.get(i).equals("world")){
                ll.add("ccc");
            }
        }

        System.out.println(ll);


    }
}
