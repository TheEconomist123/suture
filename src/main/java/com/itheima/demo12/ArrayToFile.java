package com.itheima.demo12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayToFile {


    public static void main(String[] args) throws IOException {


        ArrayList<Student> stu = new ArrayList<Student>();


        Student student1 = new Student(1002, "林青霞", 20, "女性");
        Student student2 = new Student(1003, "李佳玲", 25, "女性");
        Student student3 = new Student(1004, "张佳宁", 23, "女性");
        Student student4 = new Student(1005, "李广美", 34, "男性");

        stu.add(student1);
        stu.add(student2);
        stu.add(student3);
        stu.add(student4);


        BufferedWriter bw = new BufferedWriter(new FileWriter("e:\\233.txt"));


        for (Student student : stu) {

            StringBuilder sb = new StringBuilder();
            sb.append(student.getId()).append(student.getName()).append(student.getAge()).append(student.getSex());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        bw.close();

    }
}
