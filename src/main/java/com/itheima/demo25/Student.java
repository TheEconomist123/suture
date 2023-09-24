package com.itheima.demo25;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/3/3
 * @time 18:00
 * @desc
 */
public class Student {

    private String  name;
    private int  age;

    public Student() {
    }

    public Student(String name, int age) {
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
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
