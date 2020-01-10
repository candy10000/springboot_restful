package com.yaxing.service;

import com.yaxing.entity.AttackTechWutt;
import java.util.List;


public interface AttackTechWuttService {


    AttackTechWutt queryById(String uId);

    AttackTechWutt insert(AttackTechWutt attackTechWutt);


    AttackTechWutt update(AttackTechWutt attackTechWutt);

}