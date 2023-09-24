package com.itheima.demo10;

public class DiGuiDemo {
    public static void main(String[] args) {


        System.out.println(fn(0));
    }

    private static int fn(int i) {
        if(i==1||i==0){
            return 1;
        }else{
            return i*fn(i-1);
        }
    }
}
