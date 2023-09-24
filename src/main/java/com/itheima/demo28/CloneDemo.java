package com.itheima.demo28;

import com.google.gson.Gson;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/28
 * @time 17:08
 * @desc
 */
public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        int [] arr={1,2,3,4,5,6,7};
        int[] newArr=new int[arr.length];
        System.arraycopy(arr,0,newArr,0,3);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+",");
        }
        System.out.println("\r\n--------------------------");
        User user = new User("小明", "刺客", arr);
          //浅客隆 针对引用类型
        // 深克隆 引用类型 就会重新创建，如果是字符串就是 直接从字符串池
        User userClone = (User)user.clone();
        user.getArrInt()[0]=100;
        System.out.println(userClone == user);
        System.out.println(user);
        System.out.println(userClone);
        System.out.println("-----------------------");
        //侧面反应是浅克隆
        System.out.println(userClone.getArrInt()==user.getArrInt());

        //第三方式工具 实现深克隆
        Gson gson = new Gson();
        //把对象变成字符串
        String s = gson.toJson(user);
        System.out.println(s);
        //把字符穿变成对象
        User user1 = gson.fromJson(s, User.class);
        user.getArrInt()[0]=222;

        System.out.println(user);
        System.out.println(user1);


    }
}
