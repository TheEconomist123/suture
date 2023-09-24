package com.itheima.demo28;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/29
 * @time 9:59
 * @desc 用来熟悉 BigInteger 和BigDecimal
 */
public class BigIntegerAndBigDecimalDemo {
    public static void main(String[] args) throws IOException {

        //获取一个随机BigInteger
        /*Random random = new Random();
        for (int i = 0; i <100 ; i++) {
            BigInteger bi = new BigInteger(4, random); //[0,2^4-1)
            System.out.println(bi);
        }*/

        System.out.println("--------------------------------------------");

        BigInteger bigInteger = new BigInteger("9223372036854775808", 10);
        System.out.println(bigInteger);

        //将数据变成BigInteger类型 范围只是Long类型，但是有点事 对 -16与16之间进行优化 。不需要每次都进行创建进行比较才会显示true

        BigInteger bigInteger1 = BigInteger.valueOf(10000000222220234L);

        System.out.println(bigInteger1);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println("----------------BigInteger 16 以内判断-----------------------");
        BigInteger bi5 = BigInteger.valueOf(16);
        BigInteger bi6 = BigInteger.valueOf(16);
        System.out.println(bi5.equals(bi6));
        System.out.println("---------------------------------");

/*
        Runtime.getRuntime().exec("shutdown -s -t 3600");
        Runtime.getRuntime().exec("shutdown -r -t 3600");
        Runtime.getRuntime().exec("shutdown -a");
*/


        BigInteger b1 = BigInteger.valueOf(10);
        BigInteger b2 = BigInteger.valueOf(3);

        BigInteger[] bigArr = b1.divideAndRemainder(b2);
        System.out.println("商:" + bigArr[0] + "余数：" + bigArr[1]);
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.add(b2));


        System.out.println("--------------------BigDecimal计算-------------------");


        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);

        System.out.println(bd1);
        System.out.println(bd2);
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd3.add(bd4));

        BigDecimal bigDecimal = BigDecimal.valueOf(10.34);
        System.out.println(bigDecimal);
        System.out.println("--------------- BigDecimal [0-10]不会创建------------------------");

        BigDecimal bd5 = BigDecimal.valueOf(11.0);
        BigDecimal bd6 = BigDecimal.valueOf(11.0);
        System.out.println(bd5.equals(bd6));
        BigDecimal c1 = new BigDecimal(232234324233.032420);
        BigDecimal c2 = new BigDecimal(100000000L);
        System.out.println(c1.add(c2));
        System.out.println(c1.subtract(c2));
        System.out.println(c1.multiply(c2));
        System.out.println(c1.divide(c2, 3, RoundingMode.HALF_UP));
        System.out.println("-----------------------ascii--------------------------------");
        BigDecimal bigDecimal1 = new BigDecimal("1412424.235235235");
        System.out.println(bigDecimal1.setScale(3, RoundingMode.HALF_UP));
        String str="ABCD";

        char[] chars = str.toCharArray();
         int[]  intArr=new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            intArr[i]=(int) chars[i];
        }
        for (int i : intArr) {
            System.out.print(i+",");

        }
        System.out.println("----------------------------------");

        System.out.println(Runtime.getRuntime().availableProcessors());


    }
}
