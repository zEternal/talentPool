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

    public OperatorT(String username, String name, String phone) {
        super(username);
        this.name = name;
        this.phone = phone;
    }

    public OperatorT(int id, Date slamp, String username, String name, String phone) {
        super(id, slamp, username);
        this.name = name;
        this.phone = phone;
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
}
