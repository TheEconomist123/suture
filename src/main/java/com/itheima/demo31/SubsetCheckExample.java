package com.itheima.demo31;

import java.util.ArrayList;
import java.util.List;

public class SubsetCheckExample {
    public static void main(String[] args) {
        List<Integer> superSet = new ArrayList<>();
        superSet.add(1);
        superSet.add(2);
        superSet.add(3);
        superSet.add(4);
        superSet.add(5);

        List<Integer> subSet = new ArrayList<>();
        subSet.add(2);
        subSet.add(4);
        subSet.add(4);
        subSet.add(4);
        subSet.add(4);
        subSet.add(4);
        subSet.add(1);

        boolean isSubset = superSet.containsAll(subSet);

        if (isSubset) {
            System.out.println("subSet 是 superSet 的子集");
        } else {
            System.out.println("subSet 不是 superSet 的子集");
        }
    }
}
