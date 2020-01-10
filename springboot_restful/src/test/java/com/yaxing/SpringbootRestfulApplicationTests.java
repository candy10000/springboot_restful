package com.yaxing;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yaxing.dao.AttackTechWuttDao;
import com.yaxing.entity.AttackTechWutt;
import com.yaxing.tools.JsonUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRestfulApplicationTests {

    @Autowired
    AttackTechWuttDao attackTechWuttDao;

    static AttackTechWutt  at = new AttackTechWutt();

    @Test
    public void contextLoads() throws Exception {
//        AttackTechWutt attackTechWutt = attackTechWuttDao.queryById("000");
//        System.out.println(attackTechWutt);

        JSONArray jsonArray = JsonUtils.getJSONObject("https://hansight.github.io/js/technique_metadata.json");
        int size = jsonArray.size();

        //System.out.println("Size: " + size);
        for (int i = 0; i < size; i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
//            System.out.println(jsonObject);
            getATW(jsonObject);

            System.out.println(at.getuId());
            AttackTechWutt atw = attackTechWuttDao.queryById(at.getuId());
            System.out.println(at.toString());
            if (atw != null){
                attackTechWuttDao.update(at);
            }else {
                attackTechWuttDao.insert(at);
            }
        }
    }

    public static void getATW(JSONObject jsonObject){
        String str = jsonObject.getJSONObject("details").getString("dataSources");
        str = str == null ? null :str.replace("\"","").trim();
        if ( str != null){
            str = str.substring(1,str.length()-1);
        }
        at.setuId(jsonObject.getString("id"));
        at.setName(jsonObject.getString("name"));
        at.setDescription(jsonObject.getString("description"));
        at.setDetection(jsonObject.getString("detection"));
        at.setDataSources(str);
    }

}
