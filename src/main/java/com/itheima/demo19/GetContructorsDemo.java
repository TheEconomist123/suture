package com.itheima.demo19;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//获取一个类的构造方法
public class GetContructorsDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        Class<?> c1 = Class.forName("com.itheima.demo19.Student");

        Constructor<?>[] contr = c1.getConstructors();

        for (Constructor<?> constructor : contr) {

            System.out.println("constructor = " + constructor);
            
        }

        System.out.println("-------------------------");

        Constructor<?>[] declare = c1.getDeclaredConstructors();

        for (Constructor<?> constructor : declare) {

            System.out.println("constructor = " + constructor);
            
        }

        System.out.println("----------------------");

        Constructor<?> dec = c1.getDeclaredConstructor(String.class);
        System.out.println("dec = " + dec);

        System.out.println("----------------------");
        Constructor<?> con1 = c1.getDeclaredConstructor();
        System.out.println("con1 = " + con1);
        System.out.println("----------------------");
        Constructor<?> dec2 = c1.getDeclaredConstructor(String.class,int.class);

        System.out.println("dec2 = " + dec2);

        System.out.println("--------------------------------");

        Constructor<?> noContructor  = c1.getDeclaredConstructor();

        Object o = noContructor.newInstance();

        System.out.println("o = " + o);


    }
}
