package com.yhtos.talent.bean;

import java.sql.Date;
/**
 * 类名：OperatorT
 * 功能：tb_operator 操作员信息表映射
 * 创建人：star
 * 创建时间：2019/12/3
 * 修改时间：
 */
public class OperatorT extends TableF {

    private String name;    //姓名
    private String phone;   //联系方式
    private int  status;    //状态
    private String region;  //区域
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public OperatorT() {
    }

    public OperatorT(String username, String name, String phone, int status, String region) {
        super(username);
        this.name = name;
        this.phone = phone;
        this.status = status;
        this.region = region;
    }

    public OperatorT(int id, String slamp, String username, String name, String phone, int status, String region) {
        super(id, slamp, username);
        this.name = name;
        this.phone = phone;
        this.status = status;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "OperatorT{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                ", region='" + region + '\'' +
                '}';
    }
}
