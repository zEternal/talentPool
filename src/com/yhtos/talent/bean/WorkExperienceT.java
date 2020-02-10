package com.yhtos.talent.bean;

/**
 * 类名：WorkExperienceT
 * 功能：tb_work_experience 用户工作经历表映射
 * 创建人：star
 * 创建时间：2019/12/2
 * 修改时间：
 */
public class WorkExperienceT extends TableF {

    private String startDate;     //开始日期
    private String endDate;       //结束日期
    private String workUnit;    //工作单位
    private String post;        //岗位
    private String leaving;     //离职原因
    private String witPhone;    //证明人电话

    public WorkExperienceT(String username, String startDate, String endDate, String workUnit,
                           String post, String leaving, String witPhone) {
        super(username);
        this.startDate = startDate;
        this.endDate = endDate;
        this.workUnit = workUnit;
        this.post = post;
        this.leaving = leaving;
        this.witPhone = witPhone;
    }

    public WorkExperienceT(int id, String slamp, String username, String startDate,
                           String endDate, String workUnit, String post, String leaving,
                           String witPhone) {
        super(id, slamp, username);
        this.startDate = startDate;
        this.endDate = endDate;
        this.workUnit = workUnit;
        this.post = post;
        this.leaving = leaving;
        this.witPhone = witPhone;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getLeaving() {
        return leaving;
    }

    public void setLeaving(String leaving) {
        this.leaving = leaving;
    }

    public String getWitPhone() {
        return witPhone;
    }

    public void setWitPhone(String witPhone) {
        this.witPhone = witPhone;
    }
}
