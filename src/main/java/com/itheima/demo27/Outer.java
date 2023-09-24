package com.itheima.demo27;

import com.alibaba.fastjson.parser.JSONToken;

import java.sql.SQLOutput;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/22
 * @time 11:16
 * @desc 内部类测试
 */
public class Outer {
    private String name = "xiaom";
    private int age = 10;
    private int phone = 120344;

    class inter {
        private String address = "啊首付款深V发";
        private int phone = 1203;

        void show() {
            System.out.println(Outer.this.name);
            System.out.println(Outer.this.age);
            System.out.println(this.address);
            System.out.println(Outer.this.phone);
        }

    }

    static class Inside {
        private String username = "小刚";
        private int age = 20;
        private static double high = 1.8;

        public void show() {
            Outer outer = new Outer();
            System.out.println(outer.age);
            System.out.println(outer.phone);
            System.out.println(outer.name);
            System.out.println(Inside.high);
            System.out.println(this.age);
            System.out.println(this.username);

        }

    }

    public void display() {

        String address = "合肥";
        class Part {
            private String phone = "18326187753";
            private String email = "2248869976@qq.com";
            public void show2() {
                System.out.println(Outer.this.name);
                System.out.println(Outer.this.age);
                System.out.println(Outer.this.phone);
                System.out.println(this.email);
                System.out.println(this.phone);
                System.out.println(address);
            }
        }

        Part part = new Part();
        part.show2();


    }


}


