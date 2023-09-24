package com.itheima.demo19;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetMethodDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        Class<?> aClass = Class.forName("com.itheima.demo19.Student");


        Method[] methods = aClass.getMethods();

        for (Method method : methods) {

            System.out.println("method = " + method);
            
        }

        System.out.println("------------------------------------");

        Method[] declaredMethods = aClass.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {

            System.out.println("declaredMethod = " + declaredMethod);
        }


        System.out.println("------------------------------------");

        Constructor<?> constructor = aClass.getConstructor();
        Object obj = constructor.newInstance();

        Method sub = aClass.getDeclaredMethod("sub");
        sub.setAccessible(true);
        String  cc = (String) sub.invoke(obj);
        System.out.println("cc = " + cc);
        System.out.println("-----------------------");
        Method  add = aClass.getDeclaredMethod("add",int.class,int.class);

         add.setAccessible(true);
         add.invoke(obj,22,44);




    }
}
