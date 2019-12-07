package com.yhtos.talent.bean;

import java.sql.Date;

/**
 * 类名：ManagementT
 * 功能：tb_management 管理区域表映射
 * 创建人：star
 * 创建时间：2019/12/3
 * 修改时间：
 */
public class ManagementT extends TableF {

    private String region;  //管理区域

    public ManagementT(String username, String region) {
        super(username);
        this.region = region;
    }

    public ManagementT(int id, Date slamp, String username, String region) {
        super(id, slamp, username);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
