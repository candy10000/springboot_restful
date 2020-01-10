package com.yaxing.tools;


import com.alibaba.fastjson.JSONArray;



public class JsonUtils {

    public static JSONArray getJSONObject(String path){

        String JsonContext = new FileUtils().ReadFile(path);
        //将读取的数据转换为JSONObject
//        System.out.println("String:" + JsonContext);
        JSONArray jsonArray = JSONArray.parseArray(JsonContext);
//        System.out.println("jsonArray:" + jsonArray);

        return  jsonArray;
    }
}
