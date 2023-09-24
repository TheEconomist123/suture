package com.itheima.demo07;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectDemo2 {

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
        //并发修改异常
      /*  ListIterator<String> sli = list.listIterator();
        while(sli.hasNext()){
            if(sli.next().equals("world")){
                list.add("ccc");
            }
        }*/
        //for循环底层就是迭代器

      /*  for (String i : list) {
            if (i.equals("hello")) {
                list.add("123213");
            }
        }*/
        System.out.println("----------------");

        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equals("world")){
                list.add("0000");
            }
        }
        System.out.println(list);


    }
}
