package com.itheima.demo32.demo01;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/9/4 004
 * @time 9:19
 * @desc
 */
public class Fu  implements GrandFather{
    @Override
    public void show() {
        System.out.println("父亲重写了show方法");
    }
}
