package com.itheima.demo19;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GetConstructorDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        Class<?> aClass = Class.forName("com.itheima.demo19.Student");

        Constructor<?> dc = aClass.getDeclaredConstructor(int.class, String.class, String.class);


        Object o = dc.newInstance(20, "小明", "是一名大二在校学生");

        System.out.println("o = " + o);

        System.out.println("-------------------------------------------------------------");

        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class);
        //在反射里面通过有构造构造方法。
        declaredConstructor.setAccessible(true);

        Object lyf = declaredConstructor.newInstance("刘亦菲");


        System.out.println("lyf = " + lyf);


    }
}
