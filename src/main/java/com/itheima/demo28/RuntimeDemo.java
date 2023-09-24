package com.itheima.demo28;

import org.omg.CORBA.SetOverrideType;

import java.io.IOException;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/27
 * @time 16:21
 * @desc
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {

        // Runtime runtime = Runtime.getRuntime();runtime

        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

//        Runtime.getRuntime().exec("notepad");
        //  Runtime.getRuntime().exec("shutdown -s -t 3600");
        Runtime.getRuntime().exec("shutdown -a ");


    }
}
