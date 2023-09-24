package com.itheima.demo07;


//测试 throws跟throw的区别。
public class TestScore {
    public static void main(String[] args) {

        try {
            method1(200);
        } catch (ScoreException e) {
            e.printStackTrace();
            System.out.println("分数不合理");
        }


    }

    private static void method1(int score) throws ScoreException {
        if (score < 0 || score > 100) {
            throw new ScoreException("分数不在合理值之内");//该异常是由方法体的语句自行处理
        } else {
            System.out.println("分数正常.");
        }



    }

    //throw  与throws 区别
    //1.throws 跟在方法申明后面，后面跟的是异常类名，throw 在方法体内，后面跟的是异常类对象名。
    //2. throws 跟多个异常类名，后面逗号隔开，throw 只能抛出一个异常类
}
