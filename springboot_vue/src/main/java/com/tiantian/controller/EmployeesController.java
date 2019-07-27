package com.tiantian.controller;

import com.tiantian.dao.EmployeesDao;
import com.tiantian.entity.Employees;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Employees)表控制层
 *是
 * @author makejava
 * @since 2019-07-26 18:58:15
 */
@RestController
@RequestMapping("employees")
public class EmployeesController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeesDao employeesDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("findall")
    public Map<String,Object> findAll() {

        Map<String,Object> map = new HashMap<>();
        List<Employees> employees = employeesDao.queryAll();
        map.put("users",employees);
        return map;
    }

    //删除
    @DeleteMapping("remove")
    public String delete(String name) {
        employeesDao.deleteById(name);
        return "true";
    }

    @DeleteMapping("batchremove")
    public String batchremove(String names) {
        if (names.contains(",")) {
            String[] str = names.trim().split(",");
            for (int i=0; i<str.length; i++){
                employeesDao .deleteById(str[i]);
            }
        }else {
            employeesDao .deleteById(names);
        }
        return "true";
    }

    //添加
    @PutMapping("add")
    public String add( Employees employees){

        employeesDao.insert(employees);
        return "true";
    }

    @PutMapping("edit")
    public String edit( Employees employees){

        employeesDao.update(employees);
        return "true";
    }

}