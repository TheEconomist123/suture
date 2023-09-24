package com.itheima.demo07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class ColleDemo01 {
    public static void main(String[] args) {


       List<String> coll = new ArrayList<>();
        coll.add("hello");
        coll.add("world");
        coll.add("java");
       /* for (int i = 0; i <coll.size() ; i++) {
             if(coll.get(i).equals("world")){
                 coll.set(i,"第三行");
             }
        }
*/
        System.out.println("coll = " + coll);

        ListIterator<String>   si = coll.listIterator();
        while(si.hasNext()){
           if(si.next().equals("hello")){
               coll.add("111");
           }
        }
        System.out.println("------------------");

        while(si.hasPrevious()){

            System.out.println(si.previous());

        }


    }
}
