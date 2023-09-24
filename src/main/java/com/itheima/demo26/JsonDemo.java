package com.itheima.demo26;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Date;
import java.util.Random;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2023/5/18
 * @time 17:18
 * @desc
 */
public class JsonDemo {
    public static void main(String[] args) {


        JSONObject requestList = new JSONObject();

        JSONArray cccArray = new JSONArray();

        for (int i=0;i<3;i++){
            JSONObject j1 = new JSONObject();
            j1.put("date",new Date());
            j1.put("name", Math.random());
            cccArray.add(j1);

        }

        requestList.put("requestList",cccArray);

        System.out.println(requestList);


        System.out.println("------------------------------");

        JSONObject retDao = new JSONObject();



        JSONObject batchInfo = new JSONObject();
        batchInfo.put("getWay",1);
        batchInfo.put("ccc",2);
        retDao.put("batchInfo",batchInfo);
        System.out.println(retDao);


    }
}
