package com.yaxing.entity;

import java.io.Serializable;

/**
 * (AttackTechWutt)实体类
 *
 * @author makejava
 * @since 2020-01-05 15:39:54
 */

public class AttackTechWutt implements Serializable {
    private static final long serialVersionUID = -84970299591430656L;

    private String uId;

    private String name;

    private String description;

    private String detection;

    private String dataSources;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetection() {
        return detection;
    }

    public void setDetection(String detection) {
        this.detection = detection;
    }

    public String getDataSources() {
        return dataSources;
    }

    public void setDataSources(String dataSources) {
        this.dataSources = dataSources;
    }

    @Override
    public String toString() {
        return "uId:"+uId+"\n"+"name:"+name+"\n"+"description:"+description+"\n"+"detection:"+detection
                +"\n"    +"dataSources:"+dataSources;
    }
}