package com.itheima.demo28;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/26
 * @time 11:06
 * @desc
 */
public class Teacher {

    private String  name;

    private int age;

    public Teacher() {

    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object obj) {

        //1.第一步如果this 代表谁调用我我代表谁, 地址值如果一样就返回true
        if (this==obj){
            return  true;
        }
        //如果obj是null 或者 this的 类型跟 obj 不是同一个类型都返回false
        if( null==obj|| this.getClass()!=obj.getClass()){
            return  false;
        }
        Teacher that= (Teacher) obj;

        return  this.name==that.name;

    }
}
