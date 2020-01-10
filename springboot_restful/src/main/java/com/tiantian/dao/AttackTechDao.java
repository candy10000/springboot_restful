package com.tiantian.dao;



import com.tiantian.entity.AttackTech;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * (AttackTechWutt)表数据库访问层
 *
 * @author makejava
 * @since 2020-01-05 13:19:21
 */
@Mapper
public interface AttackTechDao {


    @Select("select * from attack_tech_wutt where U_ID = #{uId}")
    AttackTech queryById(String uId);

//    List<AttackTech> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    @Insert("insert into attack_tech_wutt(U_ID,name,description,detection,dataSources) value(#{U_ID},#{name},#{description},#{detection},#{dataSources})")
    int insert(AttackTech attackTechWutt);


    @Update("update attack_tech_wutt set name=#{name},description=#{description},detection=#{detection},dataSources=#{dataSources} where U_ID =#{U_ID}")
    int update(AttackTech attackTechWutt);


}