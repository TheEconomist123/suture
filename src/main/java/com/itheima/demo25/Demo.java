package com.itheima.demo25;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/2/26
 * @time 9:59
 * @desc
 */
public class Demo {
    public static void main(String[] args) {
   /*     Zi zi = new Zi();
        zi.show();
*/

        //Fu.str = "静态变量赋值";

        Fu fu = new Fu();

        fu.age = 10;
        fu.name = "小明";
        fu.str = "ccccc";
        fu.show();


        Fu fu1 = new Fu();

        fu1.age = 100;
        fu1.name = "小红";

        fu1.str = "aaaaaaa";


        Fu fu2 = new Fu();
        fu2.age = 1000;
        fu2.name = "小刚";


        fu1.show();
        fu2.show();

        Zi zi = new Zi();
        zi.show();


    }
}
