package com.itheima.demo20;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("黎明", 10, "中国",0));
        people.add(new Person("谢霆锋", 40, "加拿大",1));
        people.add(new Person("尔康", 24, "缅甸",0));
        people.add(new Person("李阳", 59, "中国",1));
        people.add(new Person("李阳", 39, "中国",1));
        people.add(new Person("康辉", 39, "日本",1));
        people.add(new Person("李艳", 29, "中国",0));
        people.add(new Person("刘美娟", 20, "美国",1));
        people.stream().filter((p) -> p.getAge() > 30).forEach(System.out::println);
        long count = people.stream().filter((p) -> p.getName().equals("中国")).count();
        System.out.println("count = " + count);
        System.out.println("-------------------------------------");

        //已知流中限制两个数据。
        people.stream().filter((p)->p.getNation().equals("中国")).limit(2).forEach(System.out::println);

        System.out.println("----------------------------------------");
        Stream<Person> skipDemo = people.stream().filter((p) -> p.getNation().equals("中国")).skip(2);
        skipDemo.forEach(System.out::println);
        System.out.println("----------------------------------------");


        people.stream().filter((p)->p.getNation().equals("中国")).distinct().forEach(System.out::println);

        System.out.println("----------------------------------------");

      people.stream().map((p) -> {
            CountryDemo countryDemo = new CountryDemo();
            countryDemo.setNation(p.getNation());
            return "国籍:"+countryDemo.getNation();
        }).distinct().forEach(System.out::println);

        System.out.println("-------------------------------------");


        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {

                return     o1.getAge()- o1.getAge();
            }

        });

        System.out.println(people);




    }
}
