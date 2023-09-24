package com.itheima.demon32;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/9/3 003
 * @time 22:41
 * @desc
 */
public interface CommonRequire {

    public  static  final int FINAL_NUM=2000;
    public static final  String  STR_NAME="周政之";

    public abstract  void method();

    public abstract  void method1();

    public default void  methodAdds(){
        System.out.println("这是新添加默认方法。。。。。。。。。。。。。");
    }

    public static  void  staticM(){
        System.out.println("静态方法在接口里面");
    }
    //jdk9开始才可以有private 写法
   /* private void show2(){

    }*/
}
