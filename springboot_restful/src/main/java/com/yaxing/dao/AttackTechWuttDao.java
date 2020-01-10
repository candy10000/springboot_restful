package com.yaxing.dao;

import com.yaxing.entity.AttackTechWutt;
import org.apache.ibatis.annotations.*;


/**
 * (AttackTechWutt)表数据库访问层
 *
 * @author makejava
 * @since 2020-01-05 15:39:55
 */
@Mapper
public interface AttackTechWuttDao {

    @Select("select * from attack_tech_wutt where U_ID = #{uId}")
    AttackTechWutt queryById(String uId);


    @Insert("insert into attack_tech_wutt(U_ID,name,DESCRIPTION,DETECTION,DATA_SOURCES) value(#{uId},#{name},#{description},#{detection},#{dataSources})")
    int insert(AttackTechWutt attackTechWutt);

    @Update("update attack_tech_wutt set name=#{name},DESCRIPTION=#{description},DETECTION=#{detection},DATA_SOURCES=#{dataSources} where U_ID =#{uId}")
    int update(AttackTechWutt attackTechWutt);


}