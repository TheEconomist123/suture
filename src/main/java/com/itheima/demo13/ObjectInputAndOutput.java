package com.itheima.demo13;

import java.io.*;

public class ObjectInputAndOutput {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        write();
        read();
    }

    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\student.txt"));

        Student stu = new Student(23, "徐泪花", "这是一组序列化", 30);

        oos.writeObject(stu);
        oos.close();

    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\student.txt"));
        Object obj = ois.readObject();
        Student stu = (Student) obj;
        System.out.println("stu = " + stu);
    }
}
