package com.itheima.demo29;

import com.itheima.demo18.demo05.Inter;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/6/11
 * @time 23:11
 * @desc 包装类 ：用一个对象，将基本数据类型给包起来
 */
public class PackagingDemo {
    public static void main(String[] args) {

        //包装类好处
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println("通过静态方法获取-------------");
        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf(124);
        Integer i5 = Integer.valueOf("0100", 2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        //这两种获取对象区别
        Integer integer = Integer.valueOf(127);
        Integer integer2 = Integer.valueOf(127);
        Integer integer3 = Integer.valueOf(128);
        Integer integer4 = Integer.valueOf(128);
        System.out.println(integer.equals(integer2));
        System.out.println(integer3.equals(integer4));
        //-128-127 之间是不会new 的 因为这区间使用的范围比较广，所以需要底层这样设计

        Integer integer1 = new Integer(1);
        Integer integer5 = new Integer(1);
        System.out.println(integer1.equals(integer5));
        System.out.println("------------包装类之间是如何进行计算的------------------");
        //1.把对象变成进行拆箱，变成基本数据类型
        //2.相加
        //3.把得到的结果进行相加 在进行装箱 变回包装类
        Integer s1 = new Integer(1);
        Integer s2 = new Integer(2);
        int s3 = s1.intValue() + s2.intValue();
        Integer s4 = new Integer(s3);
        //自从jdk5以后进行拆装箱 ，所以不需要考虑
        System.out.println("Integer 常用的包装类----------------");

        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.toOctalString(8));
        System.out.println(Integer.toHexString(15));
        System.out.println(Integer.parseInt("20"));


    }
}
