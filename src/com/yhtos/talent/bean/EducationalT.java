package com.yhtos.talent.bean;

import java.sql.Date;

/**
 * 类名：EducationalT
 * 功能：tb_educational 用户教育背景表映射
 * 创建人：star
 * 创建时间：2019/12/2
 * 修改时间：
 */
public class EducationalT extends TableF{

    private Date startDate;     //开始日期
    private Date endDate;       //结束日期
    private String school;      //学校名称
    private String education;   //学历
    private String eduSource;   //学历获取方式
    private String schoolAddr;  //学校所在地

    public EducationalT(String username, Date startDate, Date endDate, String school,
                        String education, String eduSource, String schoolAddr) {
        super(username);
        this.startDate = startDate;
        this.endDate = endDate;
        this.school = school;
        this.education = education;
        this.eduSource = eduSource;
        this.schoolAddr = schoolAddr;
    }

    public EducationalT(int id, Date slamp, String username, Date startDate,
                        Date endDate, String school, String education, String eduSource,
                        String schoolAddr) {
        super(id, slamp, username);
        this.startDate = startDate;
        this.endDate = endDate;
        this.school = school;
        this.education = education;
        this.eduSource = eduSource;
        this.schoolAddr = schoolAddr;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEduSource() {
        return eduSource;
    }

    public void setEduSource(String eduSource) {
        this.eduSource = eduSource;
    }

    public String getSchoolAddr() {
        return schoolAddr;
    }

    public void setSchoolAddr(String schoolAddr) {
        this.schoolAddr = schoolAddr;
    }


}
