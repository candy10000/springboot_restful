package com.yaxing.service.impl;

import com.yaxing.entity.AttackTechWutt;
import com.yaxing.dao.AttackTechWuttDao;
import com.yaxing.service.AttackTechWuttService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AttackTechWutt)表服务实现类
 *
 * @author makejava
 * @since 2020-01-05 15:39:57
 */
@Service("attackTechWuttService")
public class AttackTechWuttServiceImpl implements AttackTechWuttService {
    @Resource
    private AttackTechWuttDao attackTechWuttDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uId 主键
     * @return 实例对象
     */
    @Override
    public AttackTechWutt queryById(String uId) {
        return this.attackTechWuttDao.queryById(uId);
    }



    /**
     * 新增数据
     *
     * @param attackTechWutt 实例对象
     * @return 实例对象
     */
    @Override
    public AttackTechWutt insert(AttackTechWutt attackTechWutt) {
        this.attackTechWuttDao.insert(attackTechWutt);
        return attackTechWutt;
    }

    /**
     * 修改数据
     *
     * @param attackTechWutt 实例对象
     * @return 实例对象
     */
    @Override
    public AttackTechWutt update(AttackTechWutt attackTechWutt) {
        this.attackTechWuttDao.update(attackTechWutt);
        return this.queryById(attackTechWutt.getuId());
    }

}