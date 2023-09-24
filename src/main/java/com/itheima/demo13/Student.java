package com.itheima.demo13;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 42L;

    private int id;
    private String name;

    private String desc;
    private transient int age;

    public Student() {

    }

    public Student(int id, String name, String desc, int age) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", age=" + age +
                '}';
    }
}
