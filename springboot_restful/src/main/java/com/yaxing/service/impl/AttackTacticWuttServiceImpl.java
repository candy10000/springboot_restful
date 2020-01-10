package com.yaxing.service.impl;

import com.yaxing.entity.AttackTacticWutt;
import com.yaxing.dao.AttackTacticWuttDao;
import com.yaxing.service.AttackTacticWuttService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("attackTacticWuttService")
public class AttackTacticWuttServiceImpl implements AttackTacticWuttService {
    @Resource
    private AttackTacticWuttDao attackTacticWuttDao;


    @Override
    public AttackTacticWutt queryById(String uId) {
        return this.attackTacticWuttDao.queryById(uId);
    }


    @Override
    public AttackTacticWutt insert(AttackTacticWutt attackTacticWutt) {
        this.attackTacticWuttDao.insert(attackTacticWutt);
        return attackTacticWutt;
    }

    @Override
    public AttackTacticWutt update(AttackTacticWutt attackTacticWutt) {
        this.attackTacticWuttDao.update(attackTacticWutt);
        return this.queryById(attackTacticWutt.getUId());
    }
}