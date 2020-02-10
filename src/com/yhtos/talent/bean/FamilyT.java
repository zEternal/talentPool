package com.yhtos.talent.bean;


/**
 * 类名：FamilyT
 * 功能：tb_family 用户家庭成员表映射
 * 创建人：star
 * 创建时间：2019/12/3
 * 修改时间：
 */
public class FamilyT extends TableF {

    private String relation;    //关系
    private String name;        //姓名
    private String phone;       //联系方式
    private String workUnit;    //工作单位

    public FamilyT(String username, String relation, String name, String phone, String workUnit) {
        super(username);
        this.relation = relation;
        this.name = name;
        this.phone = phone;
        this.workUnit = workUnit;
    }

    public FamilyT(int id, String slamp, String username, String relation, String name, String phone,
                   String workUnit) {
        super(id, slamp, username);
        this.relation = relation;
        this.name = name;
        this.phone = phone;
        this.workUnit = workUnit;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
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

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }
}
