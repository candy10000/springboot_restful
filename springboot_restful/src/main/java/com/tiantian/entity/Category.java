package com.tiantian.entity;

import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;

import java.io.Serializable;

/**
 * (Category)实体类
 *
 * @author makejava
 * @since 2019-07-16 09:17:26
 */
public class Category implements Serializable {
    private static final long serialVersionUID = 545181607606264672L;
    
    private Integer id;
    
    private String name;

    public Category(){}
    public  Category(int id,String name){
        this.id = id;
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}