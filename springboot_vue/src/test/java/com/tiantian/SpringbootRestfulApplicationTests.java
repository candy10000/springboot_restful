package com.tiantian;

import com.tiantian.dao.EmployeesDao;
import com.tiantian.dao.UserDao;
import com.tiantian.entity.Employees;
import com.tiantian.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRestfulApplicationTests {
    @Autowired
    UserDao userDao;

    @Autowired
    EmployeesDao employeesDao;

    @Test
    public void contextLoads() throws Exception {

//        User user = userDao.queryById("ann");
//        System.out.println(user.toString());
          List list = employeesDao.queryAll();
    }

}
