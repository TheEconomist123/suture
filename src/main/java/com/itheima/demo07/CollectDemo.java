package com.itheima.demo07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectDemo {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        // int[] arr= new int[20];
       //  System.out.println(arr.length);
        String  ss="aaaaaaaa";
        coll.add("a");
        coll.add("b");
        coll.add("c");
        System.out.println(coll.size());
        boolean c = coll.remove("c");
        System.out.println(c);
        System.out.println(coll.size());
       // coll.clear();
        System.out.println(coll.size());
        System.out.println(coll.isEmpty());

        Iterator<String> it = coll.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
