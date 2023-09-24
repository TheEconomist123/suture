package com.itheima.demo18.demo01;

public class EatableDemo {
    public static void main(String[] args) {

        EatableImpl e = new EatableImpl();
        useEatable(e);
        //匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一苹果，疾病远离我。匿名内部类。");
            }
        });


        useEatable(()->{
            System.out.println("一天一苹果，疾病远离我。lambda");
        });
    }

    public static void useEatable(Eatable e) {
        e.eat();
    }


}
