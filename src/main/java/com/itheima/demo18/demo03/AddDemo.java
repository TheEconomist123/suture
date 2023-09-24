package com.itheima.demo18.demo03;

public class AddDemo {

    public static void main(String[] args) {

        useAdd(new Addable() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        });

     /*   useAdd((int a,int b)->{
            return a-b;
        });
*/
        /*useAdd((a, b) -> {
            return a - b;
        });*/

        useAdd((a, b) -> a+b);


    }

    public static void useAdd(Addable addable) {
        int add = addable.add(3, 6);
        System.out.println("add = " + add);


    }


}
