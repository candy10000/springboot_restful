package com.yaxing;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yaxing.dao.AttackTacticWuttDao;
import com.yaxing.dao.AttackTechWuttDao;
import com.yaxing.entity.AttackTacticWutt;
import com.yaxing.entity.AttackTechWutt;
import com.yaxing.tools.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class Main {
     @Autowired
     private  AttackTechWuttDao attackTechWuttDao;

     @Autowired
     private AttackTacticWuttDao attackTacticWuttDao;

     public static  Main main;
     static AttackTechWutt  attackTechWutt = new AttackTechWutt();
     static AttackTacticWutt  attackTacticWutt = new AttackTacticWutt();

//    初始化静态变量
    @PostConstruct
    public void  init(){
        main = this;
        main.attackTechWuttDao = this.attackTechWuttDao;
        main.attackTacticWuttDao = this.attackTacticWuttDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        //获取文件数据解析成json数组
        JSONArray jsonArray = JsonUtils.getJSONObject("https://hansight.github.io/js/technique_metadata.json");
        int size = jsonArray.size();

        //遍历json数组
        System.out.println("technique_metadata.json文件数据有" + size+"条");
        for (int i = 0; i < size; i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            setAttackTechWutt(jsonObject);
            //修改数据库
            main.updateDB("attackTechWutt");
        }
        System.out.println("attack_tech_wutt表更新完成");


        //===============================================
        jsonArray = JsonUtils.getJSONObject("https://hansight.github.io/js/tactic_metadata.json");
        size = jsonArray.size();
       //遍历json数组
        System.out.println("tactic_metadata.json文件数据有" + size+"条");
        for (int i = 0; i < size; i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            setAttackTacticWutt(jsonObject);
            //修改数据库
            main.updateDB("attackTacticWutt");
        }
        System.out.println("attack_tactic_wutt表更新完成");
    }


//    更新数据库
    public void updateDB(String style){

        if (style.equals("attackTechWutt")){
            AttackTechWutt atw = this.attackTechWuttDao.queryById(attackTechWutt.getuId());
            if (atw != null){
                this.attackTechWuttDao.update(attackTechWutt);
            }else {
                this.attackTechWuttDao.insert(attackTechWutt);
            }
        }else {

            AttackTacticWutt tactic = this.attackTacticWuttDao.queryById(attackTacticWutt.getUId());
            if (tactic != null){
                this.attackTacticWuttDao.update(attackTacticWutt);
            }else {
                this.attackTacticWuttDao.insert(attackTacticWutt);
            }
        }
    }



    public static void setAttackTechWutt(JSONObject jsonObject){
        String str = jsonObject.getJSONObject("details").getString("dataSources");
        str = str == null ? null :str.replace("\"","").trim();
        if ( str != null){
            str = str.substring(1,str.length()-1);
        }
        attackTechWutt.setuId(jsonObject.getString("id"));
        attackTechWutt.setName(jsonObject.getString("name"));
        attackTechWutt.setDescription(jsonObject.getString("description"));
        attackTechWutt.setDetection(jsonObject.getString("detection"));
        attackTechWutt.setDataSources(str);
    }

    public static void setAttackTacticWutt(JSONObject jsonObject){

        attackTacticWutt.setUId(jsonObject.getString("id"));
        attackTacticWutt.setName(jsonObject.getString("name"));
        attackTacticWutt.setDescription(jsonObject.getString("description"));
    }
}
