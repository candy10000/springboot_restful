package com.yaxing.entity;

import java.io.Serializable;

public class LogWutt implements Serializable {
    private static final long serialVersionUID = 882141087164116918L;
    
    private Integer id;
    
    private String opreation;
    
    private Object datetime;
    
    private String uId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpreation() {
        return opreation;
    }

    public void setOpreation(String opreation) {
        this.opreation = opreation;
    }

    public Object getDatetime() {
        return datetime;
    }

    public void setDatetime(Object datetime) {
        this.datetime = datetime;
    }

    public String getUId() {
        return uId;
    }

    public void setUId(String uId) {
        this.uId = uId;
    }

}