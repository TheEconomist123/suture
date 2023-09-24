package com.itheima.demo08;

public class GenericImpl<T> implements Generic<T> {

    @Override
    public void show(T t) {

        System.out.println(t);

    }


}
