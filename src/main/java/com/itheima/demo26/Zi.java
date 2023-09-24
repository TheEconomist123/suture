package com.itheima.demo26;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/3/9
 * @time 17:11
 * @desc
 */
public class Zi extends  Fu {


     private  int age ;

     private  String  name ;


     public  static   void show(){

         System.out.println("在zi类 show 方法");
     }

     public   void add (){

         System.out.println("zi add");
     }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
