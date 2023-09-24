package com.itheima.demo25;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/3/3
 * @time 17:59
 * @desc
 */
public class Test02 {
    public static void main(String[] args) {


        JSONObject jsonObject = new JSONObject();

        List<Student> list = new ArrayList<>();
        Student s = new Student("小明", 20);
        list.add(s);
        jsonObject.put("cc:",list);

        System.out.println(jsonObject);








    }
}
