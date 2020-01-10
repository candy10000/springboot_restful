package com.tiantian.service;


import com.tiantian.entity.Category;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * (Category)表服务接口
 *
 * @author makejava
 * @since 2019-07-16 09:17:28
 */
public interface CategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
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
     * @return 实例对象
     */
    Category insert(Category category);

    /**
     * 修改数据
     *
     * @param category 实例对象
     * @return 实例对象
     */
    Category update(Category category);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
}