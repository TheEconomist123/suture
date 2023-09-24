package com.itheima.demo18.demo02;

public class FlyDemo {
    public static void main(String[] args) {
        useFly(new Fly() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("适合出去潇洒。");
            }
        });

       /* useFly((String s)->{
            System.out.println(s);
            System.out.println("lambda表达式。。");
        });*/

      /*  useFly(( s)->{
            System.out.println(s);
            System.out.println("lambda表达式。。");
        });*/
      /*  useFly(s->{
            System.out.println(s);
        });
*/

        useFly(s-> System.out.println(s));


    }
    public static void useFly(Fly f) {
        f.fly("风和日丽，晴空万里");
    }
}
