package com.yaxing.service;

import com.yaxing.entity.AttackTacticWutt;

/**
 * (AttackTacticWutt)表服务接口
 *
 * @author makejava
 * @since 2020-01-06 11:37:18
 */
public interface AttackTacticWuttService {


    AttackTacticWutt queryById(String uId);

    AttackTacticWutt insert(AttackTacticWutt attackTacticWutt);

    AttackTacticWutt update(AttackTacticWutt attackTacticWutt);

}