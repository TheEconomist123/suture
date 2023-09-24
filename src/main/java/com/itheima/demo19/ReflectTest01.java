package com.itheima.demo19;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectTest01 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {


        List<Integer> list = new ArrayList<>();

        Class<? extends List> aClass = list.getClass();
        Method add = aClass.getMethod("add", Object.class);

        add.invoke(list,"hello");
        add.invoke(list,"world");
        add.invoke(list,"java");
        System.out.println("list = " + list);
        System.out.println(list.get(0));
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        
        
        
        
        



    }
}
