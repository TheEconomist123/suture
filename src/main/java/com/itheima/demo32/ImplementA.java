package com.itheima.demo32;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/9/3 003
 * @time 22:43
 * @desc
 */
public class ImplementA implements  CommonRequire{
    @Override
    public void method() {
        System.out.println("方法一");
    }

    @Override
    public void method1() {
        System.out.println("方法二");
    }

    public  void  methodAdds(){
        System.out.println("重写接口里面默认方法。。。。。。。。。。");
    }


    public  void staticM(){
        System.out.println("--------2222-----------");
    }


}
