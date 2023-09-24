package com.itheima.demo19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ConfigDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
       /* className=com.itheima.demo19.Teacher
        methodName=teacher*/

        Properties pro = new Properties();

        FileReader fileReader = new FileReader("class.txt");

        pro.load(fileReader);
        fileReader.close();
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        Class<?> aClass = Class.forName(className);

        Constructor<?> contructor = aClass.getConstructor();
        Object obj = contructor.newInstance();

        Method method = aClass.getMethod(methodName);
        Object invoke = method.invoke(obj);


    }
}
