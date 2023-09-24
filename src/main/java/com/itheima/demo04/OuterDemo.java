package com.itheima.demo04;

public class OuterDemo {

    private int age = 10;

    private class InnerDemo {
        public void show() {
            System.out.println("age:" + age);
        }
    }

    public void show() {
        InnerDemo innerDemo = new InnerDemo();
        innerDemo.show();
    }


}
