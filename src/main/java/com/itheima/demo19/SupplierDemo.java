package com.itheima.demo19;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {


        SupplierDemo supplierDemo = new SupplierDemo();
        supplierDemo.add(1,2,SupplierDemo::print1);



        /*String string = getString(() -> "小明");
        System.out.println("string = " + string);


        int anInt = getInt(() -> 100);

        System.out.println("anInt = " + anInt);
*/

    }

    public   static  String   getString (Supplier<String> sup){

       return  sup.get();
    }

    public   static  int   getInt (Supplier<Integer> sup){

        return  sup.get();
    }



    public int add(int a, int b, Consumer<Integer> con){
        //
        int c =a+b;
        con.accept(c);
        return c;
        //
    }

    public static void print(int c){
        System.out.println(c);
    }

    public static void print1(int c){
        System.out.println(c);
    }







}
