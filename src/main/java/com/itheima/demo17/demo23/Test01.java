package com.itheima.demo17.demo23;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/1/10
 * @time 9:45
 * @desc
 */
public class Test01 {

    public static void main(String[] args) {

        //合成test.json 数据

        JSONObject persons = new JSONObject();

        JSONArray personArray = new JSONArray();

        JSONObject person1 = new JSONObject();

        person1.put("name", "小明");
        person1.put("age", 30);


        JSONObject person2 = new JSONObject();
        person2.put("name", "小刚");
        person2.put("age", 40);

        personArray.add(0, person1);
        personArray.add(1, person2);

        JSONObject commonJson = new JSONObject();
        commonJson.put("ftpAddr", "莲花路18号");
        commonJson.put("code", 3021);

        persons.put("total", 20);
        persons.put("person",personArray);
        persons.put("common",commonJson);

        System.out.println(persons.toString());

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("persons",persons);
        System.out.println(jsonObject.toString());


    }
}
