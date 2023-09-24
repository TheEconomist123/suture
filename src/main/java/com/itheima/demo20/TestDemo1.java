package com.itheima.demo20;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestDemo1 {

    public static void main(String[] args) {


        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        int compare = comparator.compare(20, 40);

        Comparator<Integer> tComparator = (s1, s2) -> {
            return Integer.compare(50, 30);
        };
        System.out.println("compare = " + compare);

        System.out.println("-----------------------");

        Comparator<Integer> cc = (s1, s2) -> Integer.compare(s1, s2);

        System.out.println(cc.compare(30, 33));

        System.out.println("-----------------------------------------------111");


        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "该进程进来了。");
                }
            }
        };

        new Thread(r1, "111").start();

        System.out.println("**********************************");


        //lambda 表达式 需要参数，但是没有返回值


        Consumer<String> ss = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        ss.accept("谎言跟誓言区别是啥");

        Consumer<String> con = s1 -> System.out.println(s1);

        con.accept("lambda表达式。。。。。");

        System.out.println("-------------------------");

        Function<Double,Long> fun= Math::round;
        Long apply = fun.apply(12321.455);
        System.out.println("apply = " + apply);


    }
}
