package com.itheima.demo12;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {

        String str = "abc";
        String str1 = "abf";
        System.out.println(str.compareTo(str1));

        Student s1 = new Student(1022, "林青霞", 20, "女性");
        Student s2 = new Student(1003, "李佳玲", 25, "女性");
        Student s3 = new Student(1104, "张佳宁", 20, "女性");
        Student s4 = new Student(1025, "李广美", 34, "男性");

        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num= o2.getAge()-o1.getAge();

                int  num2=num==0?o2.getId()-o1.getId():num;
                return  num2;
            }
        });

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (Student t : ts) {
            System.out.println(t.getAge()+"---"+t.getName()+"---"+t.getId());
        }






    }
}
