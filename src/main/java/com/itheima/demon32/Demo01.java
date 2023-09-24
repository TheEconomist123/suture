package com.itheima.demon32;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/9/3 003
 * @time 22:48
 * @desc
 */
public class Demo01 {
    public static void main(String[] args) {

        ImplementA a = new ImplementA();
        a.method1();
        //调用默认方法，如果实现里面没有，会向上找借口里面方法。
        a.methodAdds();
        //  private  default  protected   public

        CommonRequire.staticM();
        a.staticM();
        System.out.println(CommonRequire.FINAL_NUM);
        System.out.println(CommonRequire.STR_NAME);
    }
}
