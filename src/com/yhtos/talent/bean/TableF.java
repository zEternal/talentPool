package com.yhtos.talent.bean;

import java.sql.Date;

public class TableF {
    private int id;             //id
    private String slamp;         //数据插入时间
    private String username;    //用户名

    public TableF() {
    }

    public TableF(String username) {
        this.username = username;
    }

    public TableF(int id, String slamp) {
        this.id = id;
        this.slamp = slamp;
    }

    public TableF(int id, String slamp, String username) {
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

    public String getSlamp() {
        return slamp;
    }

    public void setSlamp(String slamp) {
        this.slamp = slamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
