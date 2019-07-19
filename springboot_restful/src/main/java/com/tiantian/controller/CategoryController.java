package com.tiantian.controller;


import com.tiantian.entity.Category;
import com.tiantian.service.CategoryService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * (Category)表控制层
 *
 * @author makejava
 * @since 2019-07-16 09:17:28
 */
@RestController
@RequestMapping("/")
public class CategoryController {
    /**
     * 服务对象
     */
    @Resource
    private CategoryService categoryService;

   // 查询全部信息
    @GetMapping("/category")
    public List<Category> list(){
        List<Category> categories = categoryService.queryAll(new Category());
        return categories;
    }

    //删除
    @DeleteMapping("/category/{id}")
    public String deleteCategory(@PathVariable("id") int id) {
        categoryService.deleteById(id);
        return "true";
    }

    //添加
    @PutMapping("/category")
    public String addCategory(Category category){

        if (category.getId() != null){
            categoryService.update(category);
        }else{
            categoryService.insert(category);
        }
        return "true";
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Category selectOne(Integer id) {
        return this.categoryService.queryById(id);
    }

}