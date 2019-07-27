package com.tiantian.entity;

import java.io.Serializable;

/**
 * (Employees)实体类
 *
 * @author makejava
 * @since 2019-07-26 18:58:15
 */
public class Employees implements Serializable {
    private static final long serialVersionUID = 953909797960235230L;
    
    private Integer id;
    
    private String name;
    
    private String addr;
    
    private Integer age;
    
    private Object birth;
    
    private Integer sex;


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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Object getBirth() {
        return birth;
    }

    public void setBirth(Object birth) {
        this.birth = birth;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", sex=" + sex +
                '}';
    }
}