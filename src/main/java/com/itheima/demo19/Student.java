package com.itheima.demo19;

public class Student {

    private int age;
    private String name;
    private String desc;
    public String sex;


    public Student(int age, String name, String desc) {
        this.age = age;
        this.name = name;
        this.desc = desc;
    }

    private Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    Student(String desc, int age) {
        this.desc = desc;
        this.age = age;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    private void add(int a, int b) {
        System.out.println("我是加法" + (a + b));
    }

    private String sub() {
        System.out.println("我是减法");

        return "减法";
    }
}
