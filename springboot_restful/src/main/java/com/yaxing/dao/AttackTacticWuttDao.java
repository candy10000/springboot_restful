package com.yaxing.dao;

import com.yaxing.entity.AttackTacticWutt;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AttackTacticWuttDao {

    @Select("select * from attack_tactic_wutt where U_ID = #{uId}")
    AttackTacticWutt queryById(String uId);

    @Insert("insert into attack_tactic_wutt(U_ID,name,DESCRIPTION) value(#{uId},#{name},#{description})")
    int insert(AttackTacticWutt attackTacticWutt);

    @Update("update attack_tactic_wutt set name=#{name},DESCRIPTION=#{description} where U_ID =#{uId}")
    int update(AttackTacticWutt attackTacticWutt);

}