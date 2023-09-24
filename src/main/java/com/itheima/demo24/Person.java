package com.itheima.demo24;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/2/21
 * @time 11:30
 * @desc
 */
public class Person {
    private String name;


    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age ");

        }
    }


}
