package com.itheima.demo13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\student.txt"));
        Object obj = ois.readObject();
        Student stu=  (Student)obj;


        System.out.println("stu = " + stu);
         




    }
}
