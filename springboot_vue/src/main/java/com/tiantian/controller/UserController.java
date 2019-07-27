package  com.tiantian.controller;


import com.sun.org.apache.bcel.internal.classfile.Code;
import com.tiantian.dao.UserDao;
import com.tiantian.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2019-07-24 09:10:58
 */
@RestController
@RequestMapping("users")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserDao userDao;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("insert")
    public int insert(User user, Model model) {
        model.addAttribute("msg","insert");
        System.out.println("user"+user.getUsername());
        return this.userDao.insert(user);
    }

    @RequestMapping("login")
    public Map<String,Object> login(User user){
        Map<String,Object> map = new HashMap<>();
        User user1 = userDao.queryById(user.getUsername());
        if (user1 != null && user1.getPassword().equals(user.getPassword())){
            map.put("user",user1);
            map.put("code","200");
            map.put("msg","请求成功");
        } else {
                map.put("code","500");
                map.put("msg","账户或密码错误");
        }
        return map;
    }

}