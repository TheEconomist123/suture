package com.itheima.demon32;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/9/3 003
 * @time 9:05
 * @desc
 */
public class Zi  extends Fu{

    int num=100;
    public Zi() {

        super(10000);
        System.out.println("子类构造方法。。。。。");
    }



    public  void  eat(){
        System.out.println("孩子吃饭。。。。。。。。。。。。"+super.num);
    }


     public void  showNum(){

        int num=10;
         System.out.println(num);
         System.out.println(this.num);
         System.out.println(super.num);

     }



}
