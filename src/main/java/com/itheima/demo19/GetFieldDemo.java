package com.itheima.demo19;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class GetFieldDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> aClass = Class.forName("com.itheima.demo19.Student");
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println("field= " + field);
        }
        System.out.println("--------------------------");

        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }

        System.out.println("------------------------");

        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);

        Constructor<?> constructor = aClass.getDeclaredConstructor();
     //   constructor.setAccessible(true);

        Object obj = constructor.newInstance();

        name.set(obj, "小明");
        System.out.println("o = " + obj);


    }
}
