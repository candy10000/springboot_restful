package com.yaxing.dao;

import com.yaxing.entity.LogWutt;
import org.apache.ibatis.annotations.Insert;


public interface LogWuttDao {


    @Insert("insert into LOG_WUTT(uId,opreation,datetime) value(#{uId},#{opreation},#{datetime})")
    int insert(LogWutt logWutt);



}