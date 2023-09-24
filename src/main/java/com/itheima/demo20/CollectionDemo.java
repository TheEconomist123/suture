package com.itheima.demo20;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("黎明", 10, "中国", 0));
        people.add(new Person("谢霆锋", 40, "加拿大", 1));
        people.add(new Person("尔康", 24, "缅甸", 1));
        people.add(new Person("李阳", 59, "中国", 1));
        people.add(new Person("李阳", 39, "中国", 0));
        people.add(new Person("康辉", 39, "日本", 0));
        people.add(new Person("李艳", 39, "中国", 1));
        people.add(new Person("刘美娟", 20, "美国", 0));
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int flag = p1.getAge() - p2.getAge();
                int flag1 = flag == 0 ? p1.getSex() - p2.getSex() : flag;
                int flag2 = flag1 == 0 ? p1.getName().compareTo(p1.getName()) : flag1;
                return flag2;

            }
        });
        for (Person person : people) {
            System.out.println("person = " + person);
        }
        System.out.println("-------------------------------------");
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd");
        for (String str : list) {
            String s = str.toUpperCase();
            System.out.println(s);
        }


    }
}
