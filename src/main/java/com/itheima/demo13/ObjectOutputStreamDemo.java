package com.itheima.demo13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

    public static void main(String[] args) throws IOException {


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\student.txt"));

        Student stu = new Student(23, "徐泪花", "这是一组序列化", 30);

        oos.writeObject(stu);
        oos.close();


    }



}
