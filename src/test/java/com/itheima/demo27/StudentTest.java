package com.itheima.demo27;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/23
 * @time 11:20
 * @desc
 */
class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student("aaq",111);
        Student student2 = new Student("afas",22);

        Class s1 = student1.getClass();
        Class s2 = student2.getClass();

        if(s1==s2){
            System.out.println("s1 and s2 is the same type ");
        }else {
            System.out.println("s1 and s2 is  not same type ");

        }
        //hashCode 是根据对象地址，或者字符串或者数字 使用hash算法计算出来的 int的数值
        //一般情况下 相同对象 返回相同hash值
        System.out.println("-------------------------split--------------------------------");
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        Student student3=student1;

        System.out.println(student3.hashCode());

        System.out.println("---------------------------------");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println("--------------equal------------------");
        //判断两个对象

        Student s3 = new Student("小明", 2);
        Student s4 = new Student("小明", 2);

        System.out.println(s3.equals(s4));



    }



}