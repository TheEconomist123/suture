package com.itheima.demo25;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/2/26
 * @time 9:56
 * @desc
 */
public class Fu {


    public  static  String str;

    public  int age;

    public  String name;


    public static String getStr() {
        return str;
    }

    public static void setStr(String str) {
        Fu.str = str;
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


    public static   void  show(){

        System.out.println("cccc");
    }

}
