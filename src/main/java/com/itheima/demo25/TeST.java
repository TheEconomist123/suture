package com.itheima.demo25;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import sun.applet.Main;

import java.util.ArrayList;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/3/3
 * @time 11:47
 * @desc
 */
public class TeST {
    public static void main(String[] args) {


        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ccc",1111);


        ArrayList<String> strings = new ArrayList<>();

        strings.add("assss");
        strings.add("sadads");
        strings.add("sadads");
        strings.add("sadads");
        System.out.println(strings);

        System.out.println(jsonObject.getJSONObject("cc1c"));


    }
}
