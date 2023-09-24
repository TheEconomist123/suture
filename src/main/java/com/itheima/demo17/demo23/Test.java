package com.itheima.demo17.demo23;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Test {

    public static void main(String[] args) {


        JSONObject json = new JSONObject();

        JSONObject json1 = new JSONObject();
        // TODO Auto-generated method stub
        json1.put("unit_id", "1");
        json1.put("title", "单局价格");
        json1.put("price", "1");
        json1.put("unit", "局/元");

        JSONObject json2 = new JSONObject();
        json2.put("unit_id", "2");
        json2.put("title", "时间单价");
        json2.put("price", "1");
        json2.put("unit", "时/元");

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(0, json1);
        jsonArray.add(1, json2);

        json.put("unitItems", jsonArray);
        json.put("total",2);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("persons",json);
        System.out.println(jsonObject);

    }
}
