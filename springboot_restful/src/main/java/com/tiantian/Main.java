package com.tiantian;

import com.tiantian.entity.Category;
import com.tiantian.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class Main {

    @Autowired
   static CategoryService categoryService;
    public static void main(String[] args) {
        List<Category> list = categoryService.queryAll(new Category());
        System.out.println(list.toString());
        Category category = categoryService.queryById(1);
        System.out.println("hhh"+categoryService.queryById(42));

    }
}
