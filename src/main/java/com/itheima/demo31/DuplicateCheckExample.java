package com.itheima.demo31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 检测重复数据并且返回重复数据
 */

public class DuplicateCheckExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(9);
        numbers.add(4);
        numbers.add(3);



        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = new HashSet<>();

        for (Integer number : numbers) {
            if (!uniqueNumbers.add(number)) {
                duplicateNumbers.add(number);
            }
        }

        StringBuffer sb = new StringBuffer();
        System.out.println("重复数据：");
        for (Integer duplicate : duplicateNumbers) {
            sb.append(duplicate+":");
        }

        System.out.println(sb.toString());
        System.out.println(sb.toString().length());
    }
}
