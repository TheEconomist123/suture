package com.itheima.demo21;

public class SingleLazyDemo {
    private SingleLazyDemo() {
    }

    private static SingleLazyDemo instance = null;

    public static SingleLazyDemo getInstance() {
        if (instance == null) {
            instance = new SingleLazyDemo();
        }
        return instance;
    }
}
