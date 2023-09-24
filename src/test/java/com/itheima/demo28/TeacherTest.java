package com.itheima.demo28;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/26
 * @time 11:08
 * @desc
 */
class TeacherTest {

    public static void main(String[] args) {


        Teacher teacher = new Teacher();

        System.out.println("name"=="name");

        System.out.println(teacher.toString());

        System.out.println(teacher.getClass());
        System.out.println(Integer.toHexString(teacher.hashCode()));

    }

}