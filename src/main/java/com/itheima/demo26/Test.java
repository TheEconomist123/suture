package com.itheima.demo26;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/3/9
 * @time 17:12
 * @desc
 */
public class Test {

    public static void main(String[] args) {

    /*
       Student stu = new Student();
        Student stu2 = new Student();
        stu.setName("小明");
        stu.setAge(20);
        stu2.setName("小明");
        stu2.setAge(20);
        System.out.println(stu.equals(stu2));
        */

         //hashCode 是对象导出来一个整型值(可以是负数，也可以是正数)
        //其实返回的是对象在 堆内存中存储的地址

        Student stu  = new Student();
        stu.setName("小明1");
        stu.setAge(200);
        Student stu1 = new Student();
        stu1.setName("小明1");
        stu1.setAge(200);
        //如果对象不同，那么hashCode值 一般是不同的。
        System.out.println(stu1.equals(stu));
        System.out.println(stu1.hashCode());
        System.out.println(stu.hashCode());


        //如果两个对象 x和 y  x.equal(y) 是true 的化， 那么 x,y hashCode 必须相同
         //如果hashCode 一样 ，则 x.equal(y) 不一定是 true


        System.out.println("----------------------------");
        Zi zi = new Zi();
        zi.setAge(10);
        zi.setName("222");


        Zi zi1 = new Zi();
        zi1.setAge(10);
        zi1.setName("222");

        System.out.println(zi.equals(zi1));
        System.out.println(zi.hashCode());
        System.out.println(zi1.hashCode());


    }
}
