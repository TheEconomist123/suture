package com.itheima.demo09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(0);
        list.add(100);
        list.add(-1);
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("list = " + list);
        Collections.reverse(list);
        System.out.println("list = " + list);
        Collections.shuffle(list);
        System.out.println("list = " + list);

    }
}
