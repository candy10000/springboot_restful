package com.tiantian;

import com.tiantian.dao.AttackTechDao;
import com.tiantian.entity.AttackTech;
import com.tiantian.entity.Category;
import com.tiantian.service.CategoryService;
import com.yaxing.entity.AttackTechWutt;
import com.yaxing.service.AttackTechWuttService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRestfulApplicationTests {
    @Autowired
    DataSource dataSource;

    @Autowired
    CategoryService categoryService;

    @Autowired
    AttackTechDao attackTechDao;

    @Test
    public void contextLoads() throws Exception {

//        Connection connection = dataSource.getConnection();
//        String sql = "select * from book ";
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        ResultSet resultSet = preparedStatement.executeQuery();
//        while (resultSet.next()){
//            System.out.println(resultSet.getString(1));
//        }
//        List<Category> list = categoryService.queryAll(new Category());
//        System.out.println(list.toString());
//        Category category = categoryService.queryById(1);
//        System.out.println("hhh"+categoryService.queryById(42));
//        categoryService.deleteById(1);
//        categoryService.insert(new Category(5,"gg"));
//        categoryService.update(new Category(5,"mm"));

        AttackTech attackTech = attackTechDao.queryById("00");
        System.out.println("hhh"+attackTech);

    }

}
