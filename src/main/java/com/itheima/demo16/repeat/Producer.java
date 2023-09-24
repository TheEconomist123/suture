package com.itheima.demo16.repeat;

import javax.sound.sampled.BooleanControl;

public class Producer implements Runnable {

    private Box b;

    public Producer(Box b) {
        this.b = b;
    }


    @Override
    public void run() {


        for (int i = 1; i <=5 ; i++) {
            b.put(i);
        }

    }
}
