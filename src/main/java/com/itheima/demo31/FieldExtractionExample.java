package com.itheima.demo31;

import java.util.ArrayList;
import java.util.List;

public class FieldExtractionExample {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 25));
        personList.add(new Person("Bob", 30));
        personList.add(new Person("Charlie", 22));

        List<String> names = new ArrayList<>();
        for (Person person : personList) {
            names.add(person.getName());
        }

        System.out.println("人的名字：");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
