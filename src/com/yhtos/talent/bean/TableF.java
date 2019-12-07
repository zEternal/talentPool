package com.yhtos.talent.bean;

import java.sql.Date;

public class TableF {
    private int id;             //id
    private Date slamp;         //数据插入时间
    private String username;    //用户名

    public TableF() {
    }

    public TableF(String username) {
        this.username = username;
    }

    public TableF(int id, Date slamp) {
        this.id = id;
        this.slamp = slamp;
    }

    public TableF(int id, Date slamp, String username) {
        this.id = id;
        this.slamp = slamp;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getSlamp() {
        return slamp;
    }

    public void setSlamp(Date slamp) {
        this.slamp = slamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
