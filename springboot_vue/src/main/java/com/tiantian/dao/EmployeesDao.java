package com.tiantian.dao;

import com.tiantian.entity.Employees;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * (Employees)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-26 18:58:15
 */
@Mapper
public interface EmployeesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Select("select * from employees where name = #{name}")
    Employees queryById(String name);



    /**
     * 通过实体作为筛选条件查询
     *
     * @param employees 实例对象
     * @return 对象列表
     */
    @Select("select * from employees ")
    List<Employees> queryAll();

    /**
     * 新增数据
     *
     * @param employees 实例对象
     * @return 影响行数
     */
    @Insert("insert into employees(name, addr, age, birth, sex) value(#{name}, #{addr}, #{age}, #{birth}, #{sex})")
    int insert(Employees employees);

    /**
     * 修改数据
     *
     * @param employees 实例对象
     * @return 影响行数
     * @Update("update category set name=#{name} where id =#{id}")
     * (addr, age, birth, sex)
     */
    @Update("update employees set addr=#{addr},age=#{age},birth=#{birth},sex=#{sex} where name = #{name}")
    int update(Employees employees);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    @Delete("delete from employees where name = #{name}")
    int deleteById(String name);

}