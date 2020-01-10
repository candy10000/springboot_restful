package com.yaxing.entity;

import java.io.Serializable;

/**
 * (AttackTacticWutt)实体类
 *
 * @author makejava
 * @since 2020-01-06 11:37:18
 */
public class AttackTacticWutt implements Serializable {
    private static final long serialVersionUID = -96455498662030915L;
    
    private String uId;
    
    private String name;
    
    private Object description;
    
    private String platformId;
    
    private Integer orderId;


    public String getUId() {
        return uId;
    }

    public void setUId(String uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "id:"+uId+"\n"+"name:"+name+"\n"+"description:"+description;
    }
}