package com.itheima.demo28;

import com.itheima.demo27.Student;

import java.util.Objects;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/28
 * @time 18:19
 * @desc
 */
public class ObjectsDemo {

    public static void main(String[] args) {
        // equal
        // isNull
        // nonNull
        String  str="";
        Student s1 = new Student("ccc", 22);
        Student s2 = new Student("ccc", 52);
        Student s3 = null;
        System.out.println(Objects.equals(s1, s2));
        System.out.println(Objects.isNull(s3));
        System.out.println(Objects.nonNull(s3));






    }
}
