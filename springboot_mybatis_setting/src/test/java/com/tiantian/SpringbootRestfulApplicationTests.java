package com.tiantian;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRestfulApplicationTests {
    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws Exception {

        Connection connection = dataSource.getConnection();
        String sql = "select * from book ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString(1));
        }
    }

}
