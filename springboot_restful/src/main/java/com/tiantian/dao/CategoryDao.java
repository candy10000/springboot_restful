package com.tiantian.dao;


import com.tiantian.entity.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;


/**
 * (Category)表数据库访问层
 *
 * @author makejava
 * @since 2019-07-16 09:17:27
 */
@Mapper
public interface CategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id
     * @return 实例对象
     */
    @Select("select * from category where id = #{id}")
    Category queryById(Integer id);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param category 实例对象
     * @return 对象列表
     */
    @Select("select * from category")
    List<Category> queryAll(Category category);

    /**
     * 新增数据
     *
     * @param category 实例对象
     * @return 影响行数
     */
    @Insert("insert into category(id,name) value(#{id},#{name})")
    int insert(Category category);

    /**
     * 修改数据
     *
     * @param category 实例对象
     * @return 影响行数
     */
    @Update("update category set name=#{name} where id =#{id}")
    int update(Category category);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    @Delete("delete from category where id =#{id}")
    int deleteById(Integer id);

}