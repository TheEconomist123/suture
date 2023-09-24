package com.itheima.demo27;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/22
 * @time 15:35
 * @desc
 */
public class Test01 {
    public static void main(String[] args) {
        //直接创建内部类对象
        Outer.Inside inside = new Outer.Inside();
        inside.show();
    }
}
