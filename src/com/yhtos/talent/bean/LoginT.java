package com.yhtos.talent.bean;

import java.sql.Date;

/**
 * 类名：LoginT
 * 功能：tb_user 用户登录表映射
 * 创建人：star
 * 创建时间：2019/12/2
 * 修改时间：
 */
public class LoginT extends TableF{

    private String password;    //密码
    private int role;           //角色

    public LoginT() {

    }

    public LoginT(String username, String password, int role) {
        super(username);
        this.password = password;
        this.role = role;
    }

    public LoginT(int id, String slamp, String username, String password, int role) {
        super(id, slamp, username);
        this.password = password;
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
