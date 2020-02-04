package com.yhtos.talent.bean;

import java.sql.Date;

/**
 * 类名：UsersInfoT
 * 功能：tb_userInfo 用户信息表映射         个人所有信息
 * 创建人：star
 * 创建时间：2019/12/2
 * 修改时间：2020/2/1
 */
public class UsersInfoT extends TableF {

    private String name;        //姓名
    private String birthday;//shengri
    private int sex;        //性别
    private String idCard;      //身份证号
    private String nation;      //民族
    private float height;       //身高
    private float weight;       //体重
    private String phone;       //电话
    private String education;   //学历
    private String health;      //健康状况
    private String marital;     //婚姻状况
    private String typeWork;    //工种
    private String addr;        //现住地址
    private String selfEva;     //自我评价
    private String comEva;      //公司评价
    private int state;      //审核状态
    private String avatar;      //头像路径
    private String idPositive;  //身份证正面
    private String idReverse;   //身份证反面
    private String jobCertifi;  //职业证书
    private String other1;      //其他证书1
    private String other2;      //其他证书2
    //教育背景
    private String eduStartDate1;
    private String eduEndDate1;
    private String school1;
    private String education1;
    private String eduSource1;
    private String schoolAddr1;
    private String eduStartDate2;
    private String eduEndDate2;
    private String school2;
    private String education2;
    private String eduSource2;
    private String schoolAddr2;
    //工作经历
    private String workStartDate1;
    private String workEndDate1;
    private String workUnit1;
    private String post1;
    private String leaving1;
    private String witPhone1;
    private String workStartDate2;
    private String workEndDate2;
    private String workUnit2;
    private String post2;
    private String leaving2;
    private String witPhone2;
    private String workStartDate3;
    private String workEndDate3;
    private String workUnit3;
    private String post3;
    private String leaving3;
    private String witPhone3;
    private String workStartDate4;
    private String workEndDate4;
    private String workUnit4;
    private String post4;
    private String leaving4;
    private String witPhone4;
    //培训经历
    private String trainDate1;
    private String trainPlace1;
    private String trainCon1;
    private String trainDate2;
    private String trainPlace2;
    private String trainCon2;
    private String trainDate3;
    private String trainPlace3;
    private String trainCon3;
    private String trainDate4;
    private String trainPlace4;
    private String trainCon4;
    //资格证书
    private String awardDate1;
    private String awardPlace1;
    private String awardCon1;
    private String awardDate2;
    private String awardPlace2;
    private String awardCon2;
    private String awardDate3;
    private String awardPlace3;
    private String awardCon3;
    private String awardDate4;
    private String awardPlace4;
    private String awardCon4;
    //家庭成员
    private String relation1;
    private String familyName1;
    private String familyPhone1;
    private String familyWorkUnit1;
    private String relation2;
    private String familyName2;
    private String familyPhone2;
    private String familyWorkUnit2;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public UsersInfoT() {
    }

    public UsersInfoT(String username, String name, String birthday, int sex, String idCard, String nation,
                      float height, float weight, String phone, String education, String health, String marital,
                      String typeWork, String addr, String selfEva, String comEva, int state, String avatar,
                      String idPositive, String idReverse, String jobCertifi, String other1, String other2,
                      String eduStartDate1, String eduEndDate1, String school1, String education1, String eduSource1,
                      String schoolAddr1, String eduStartDate2, String eduEndDate2, String school2, String education2,
                      String eduSource2, String schoolAddr2, String workStartDate1, String workEndDate1, String workUnit1,
                      String post1, String leaving1, String witPhone1, String workStartDate2, String workEndDate2,
                      String workUnit2, String post2, String leaving2, String witPhone2, String workStartDate3,
                      String workEndDate3, String workUnit3, String post3, String leaving3, String witPhone3,
                      String workStartDate4, String workEndDate4, String workUnit4, String post4, String leaving4,
                      String witPhone4, String trainDate1, String trainPlace1, String trainCon1, String trainDate2,
                      String trainPlace2, String trainCon2, String trainDate3, String trainPlace3, String trainCon3,
                      String trainDate4, String trainPlace4, String trainCon4, String awardDate1, String awardPlace1,
                      String awardCon1, String awardDate2, String awardPlace2, String awardCon2, String awardDate3,
                      String awardPlace3, String awardCon3, String awardDate4, String awardPlace4, String awardCon4,
                      String relation1, String familyName1, String familyPhone1, String familyWorkUnit1, String relation2,
                      String familyName2, String familyPhone2, String familyWorkUnit2) {
        super(username);
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.idCard = idCard;
        this.nation = nation;
        this.height = height;
        this.weight = weight;
        this.phone = phone;
        this.education = education;
        this.health = health;
        this.marital = marital;
        this.typeWork = typeWork;
        this.addr = addr;
        this.selfEva = selfEva;
        this.comEva = comEva;
        this.state = state;
        this.avatar = avatar;
        this.idPositive = idPositive;
        this.idReverse = idReverse;
        this.jobCertifi = jobCertifi;
        this.other1 = other1;
        this.other2 = other2;
        this.eduStartDate1 = eduStartDate1;
        this.eduEndDate1 = eduEndDate1;
        this.school1 = school1;
        this.education1 = education1;
        this.eduSource1 = eduSource1;
        this.schoolAddr1 = schoolAddr1;
        this.eduStartDate2 = eduStartDate2;
        this.eduEndDate2 = eduEndDate2;
        this.school2 = school2;
        this.education2 = education2;
        this.eduSource2 = eduSource2;
        this.schoolAddr2 = schoolAddr2;
        this.workStartDate1 = workStartDate1;
        this.workEndDate1 = workEndDate1;
        this.workUnit1 = workUnit1;
        this.post1 = post1;
        this.leaving1 = leaving1;
        this.witPhone1 = witPhone1;
        this.workStartDate2 = workStartDate2;
        this.workEndDate2 = workEndDate2;
        this.workUnit2 = workUnit2;
        this.post2 = post2;
        this.leaving2 = leaving2;
        this.witPhone2 = witPhone2;
        this.workStartDate3 = workStartDate3;
        this.workEndDate3 = workEndDate3;
        this.workUnit3 = workUnit3;
        this.post3 = post3;
        this.leaving3 = leaving3;
        this.witPhone3 = witPhone3;
        this.workStartDate4 = workStartDate4;
        this.workEndDate4 = workEndDate4;
        this.workUnit4 = workUnit4;
        this.post4 = post4;
        this.leaving4 = leaving4;
        this.witPhone4 = witPhone4;
        this.trainDate1 = trainDate1;
        this.trainPlace1 = trainPlace1;
        this.trainCon1 = trainCon1;
        this.trainDate2 = trainDate2;
        this.trainPlace2 = trainPlace2;
        this.trainCon2 = trainCon2;
        this.trainDate3 = trainDate3;
        this.trainPlace3 = trainPlace3;
        this.trainCon3 = trainCon3;
        this.trainDate4 = trainDate4;
        this.trainPlace4 = trainPlace4;
        this.trainCon4 = trainCon4;
        this.awardDate1 = awardDate1;
        this.awardPlace1 = awardPlace1;
        this.awardCon1 = awardCon1;
        this.awardDate2 = awardDate2;
        this.awardPlace2 = awardPlace2;
        this.awardCon2 = awardCon2;
        this.awardDate3 = awardDate3;
        this.awardPlace3 = awardPlace3;
        this.awardCon3 = awardCon3;
        this.awardDate4 = awardDate4;
        this.awardPlace4 = awardPlace4;
        this.awardCon4 = awardCon4;
        this.relation1 = relation1;
        this.familyName1 = familyName1;
        this.familyPhone1 = familyPhone1;
        this.familyWorkUnit1 = familyWorkUnit1;
        this.relation2 = relation2;
        this.familyName2 = familyName2;
        this.familyPhone2 = familyPhone2;
        this.familyWorkUnit2 = familyWorkUnit2;
    }

    public UsersInfoT(String username, String name, int sex, String idCard, String nation, float height,
                      float weight, String phone, String education, String health, String marital, String typeWork,
                      String addr, String selfEva, String comEva, int state, String avatar, String idPositive,
                      String idReverse, String jobCertifi, String other1, String other2, String eduStartDate1,
                      String eduEndDate1, String school1, String education1, String eduSource1, String schoolAddr1,
                      String eduStartDate2, String eduEndDate2, String school2, String education2, String eduSource2,
                      String schoolAddr2, String workStartDate1, String workEndDate1, String workUnit1, String post1,
                      String leaving1, String witPhone1, String workStartDate2, String workEndDate2, String workUnit2,
                      String post2, String leaving2, String witPhone2, String workStartDate3, String workEndDate3,
                      String workUnit3, String post3, String leaving3, String witPhone3, String workStartDate4,
                      String workEndDate4, String workUnit4, String post4, String leaving4, String witPhone4,
                      String trainDate1, String trainPlace1, String trainCon1, String trainDate2, String trainPlace2,
                      String trainCon2, String trainDate3, String trainPlace3, String trainCon3, String trainDate4,
                      String trainPlace4, String trainCon4, String awardDate1, String awardPlace1, String awardCon1,
                      String awardDate2, String awardPlace2, String awardCon2, String awardDate3, String awardPlace3,
                      String awardCon3, String awardDate4, String awardPlace4, String awardCon4, String relation1,
                      String familyName1, String familyPhone1, String familyWorkUnit1, String relation2,
                      String familyName2, String familyPhone2, String familyWorkUnit2) {
        super(username);
        this.name = name;
        this.sex = sex;
        this.idCard = idCard;
        this.nation = nation;
        this.height = height;
        this.weight = weight;
        this.phone = phone;
        this.education = education;
        this.health = health;
        this.marital = marital;
        this.typeWork = typeWork;
        this.addr = addr;
        this.selfEva = selfEva;
        this.comEva = comEva;
        this.state = state;
        this.avatar = avatar;
        this.idPositive = idPositive;
        this.idReverse = idReverse;
        this.jobCertifi = jobCertifi;
        this.other1 = other1;
        this.other2 = other2;
        this.eduStartDate1 = eduStartDate1;
        this.eduEndDate1 = eduEndDate1;
        this.school1 = school1;
        this.education1 = education1;
        this.eduSource1 = eduSource1;
        this.schoolAddr1 = schoolAddr1;
        this.eduStartDate2 = eduStartDate2;
        this.eduEndDate2 = eduEndDate2;
        this.school2 = school2;
        this.education2 = education2;
        this.eduSource2 = eduSource2;
        this.schoolAddr2 = schoolAddr2;
        this.workStartDate1 = workStartDate1;
        this.workEndDate1 = workEndDate1;
        this.workUnit1 = workUnit1;
        this.post1 = post1;
        this.leaving1 = leaving1;
        this.witPhone1 = witPhone1;
        this.workStartDate2 = workStartDate2;
        this.workEndDate2 = workEndDate2;
        this.workUnit2 = workUnit2;
        this.post2 = post2;
        this.leaving2 = leaving2;
        this.witPhone2 = witPhone2;
        this.workStartDate3 = workStartDate3;
        this.workEndDate3 = workEndDate3;
        this.workUnit3 = workUnit3;
        this.post3 = post3;
        this.leaving3 = leaving3;
        this.witPhone3 = witPhone3;
        this.workStartDate4 = workStartDate4;
        this.workEndDate4 = workEndDate4;
        this.workUnit4 = workUnit4;
        this.post4 = post4;
        this.leaving4 = leaving4;
        this.witPhone4 = witPhone4;
        this.trainDate1 = trainDate1;
        this.trainPlace1 = trainPlace1;
        this.trainCon1 = trainCon1;
        this.trainDate2 = trainDate2;
        this.trainPlace2 = trainPlace2;
        this.trainCon2 = trainCon2;
        this.trainDate3 = trainDate3;
        this.trainPlace3 = trainPlace3;
        this.trainCon3 = trainCon3;
        this.trainDate4 = trainDate4;
        this.trainPlace4 = trainPlace4;
        this.trainCon4 = trainCon4;
        this.awardDate1 = awardDate1;
        this.awardPlace1 = awardPlace1;
        this.awardCon1 = awardCon1;
        this.awardDate2 = awardDate2;
        this.awardPlace2 = awardPlace2;
        this.awardCon2 = awardCon2;
        this.awardDate3 = awardDate3;
        this.awardPlace3 = awardPlace3;
        this.awardCon3 = awardCon3;
        this.awardDate4 = awardDate4;
        this.awardPlace4 = awardPlace4;
        this.awardCon4 = awardCon4;
        this.relation1 = relation1;
        this.familyName1 = familyName1;
        this.familyPhone1 = familyPhone1;
        this.familyWorkUnit1 = familyWorkUnit1;
        this.relation2 = relation2;
        this.familyName2 = familyName2;
        this.familyPhone2 = familyPhone2;
        this.familyWorkUnit2 = familyWorkUnit2;
    }

    public UsersInfoT(int id, Date slamp, String username, String name, int sex, String idCard, String nation,
                      float height, float weight, String phone, String education, String health, String marital,
                      String typeWork, String addr, String selfEva, String comEva, int state, String avatar,
                      String idPositive, String idReverse, String jobCertifi, String other1, String other2,
                      String eduStartDate1, String eduEndDate1, String school1, String education1, String eduSource1,
                      String schoolAddr1, String eduStartDate2, String eduEndDate2, String school2, String education2,
                      String eduSource2, String schoolAddr2, String workStartDate1, String workEndDate1,
                      String workUnit1, String post1, String leaving1, String witPhone1, String workStartDate2,
                      String workEndDate2, String workUnit2, String post2, String leaving2, String witPhone2,
                      String workStartDate3, String workEndDate3, String workUnit3, String post3, String leaving3,
                      String witPhone3, String workStartDate4, String workEndDate4, String workUnit4, String post4,
                      String leaving4, String witPhone4, String trainDate1, String trainPlace1, String trainCon1,
                      String trainDate2, String trainPlace2, String trainCon2, String trainDate3, String trainPlace3,
                      String trainCon3, String trainDate4, String trainPlace4, String trainCon4, String awardDate1,
                      String awardPlace1, String awardCon1, String awardDate2, String awardPlace2, String awardCon2,
                      String awardDate3, String awardPlace3, String awardCon3, String awardDate4, String awardPlace4,
                      String awardCon4, String relation1, String familyName1, String familyPhone1, String familyWorkUnit1,
                      String relation2, String familyName2, String familyPhone2, String familyWorkUnit2) {
        super(id, slamp, username);
        this.name = name;
        this.sex = sex;
        this.idCard = idCard;
        this.nation = nation;
        this.height = height;
        this.weight = weight;
        this.phone = phone;
        this.education = education;
        this.health = health;
        this.marital = marital;
        this.typeWork = typeWork;
        this.addr = addr;
        this.selfEva = selfEva;
        this.comEva = comEva;
        this.state = state;
        this.avatar = avatar;
        this.idPositive = idPositive;
        this.idReverse = idReverse;
        this.jobCertifi = jobCertifi;
        this.other1 = other1;
        this.other2 = other2;
        this.eduStartDate1 = eduStartDate1;
        this.eduEndDate1 = eduEndDate1;
        this.school1 = school1;
        this.education1 = education1;
        this.eduSource1 = eduSource1;
        this.schoolAddr1 = schoolAddr1;
        this.eduStartDate2 = eduStartDate2;
        this.eduEndDate2 = eduEndDate2;
        this.school2 = school2;
        this.education2 = education2;
        this.eduSource2 = eduSource2;
        this.schoolAddr2 = schoolAddr2;
        this.workStartDate1 = workStartDate1;
        this.workEndDate1 = workEndDate1;
        this.workUnit1 = workUnit1;
        this.post1 = post1;
        this.leaving1 = leaving1;
        this.witPhone1 = witPhone1;
        this.workStartDate2 = workStartDate2;
        this.workEndDate2 = workEndDate2;
        this.workUnit2 = workUnit2;
        this.post2 = post2;
        this.leaving2 = leaving2;
        this.witPhone2 = witPhone2;
        this.workStartDate3 = workStartDate3;
        this.workEndDate3 = workEndDate3;
        this.workUnit3 = workUnit3;
        this.post3 = post3;
        this.leaving3 = leaving3;
        this.witPhone3 = witPhone3;
        this.workStartDate4 = workStartDate4;
        this.workEndDate4 = workEndDate4;
        this.workUnit4 = workUnit4;
        this.post4 = post4;
        this.leaving4 = leaving4;
        this.witPhone4 = witPhone4;
        this.trainDate1 = trainDate1;
        this.trainPlace1 = trainPlace1;
        this.trainCon1 = trainCon1;
        this.trainDate2 = trainDate2;
        this.trainPlace2 = trainPlace2;
        this.trainCon2 = trainCon2;
        this.trainDate3 = trainDate3;
        this.trainPlace3 = trainPlace3;
        this.trainCon3 = trainCon3;
        this.trainDate4 = trainDate4;
        this.trainPlace4 = trainPlace4;
        this.trainCon4 = trainCon4;
        this.awardDate1 = awardDate1;
        this.awardPlace1 = awardPlace1;
        this.awardCon1 = awardCon1;
        this.awardDate2 = awardDate2;
        this.awardPlace2 = awardPlace2;
        this.awardCon2 = awardCon2;
        this.awardDate3 = awardDate3;
        this.awardPlace3 = awardPlace3;
        this.awardCon3 = awardCon3;
        this.awardDate4 = awardDate4;
        this.awardPlace4 = awardPlace4;
        this.awardCon4 = awardCon4;
        this.relation1 = relation1;
        this.familyName1 = familyName1;
        this.familyPhone1 = familyPhone1;
        this.familyWorkUnit1 = familyWorkUnit1;
        this.relation2 = relation2;
        this.familyName2 = familyName2;
        this.familyPhone2 = familyPhone2;
        this.familyWorkUnit2 = familyWorkUnit2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public String getTypeWork() {
        return typeWork;
    }

    public void setTypeWork(String typeWork) {
        this.typeWork = typeWork;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getSelfEva() {
        return selfEva;
    }

    public void setSelfEva(String selfEva) {
        this.selfEva = selfEva;
    }

    public String getComEva() {
        return comEva;
    }

    public void setComEva(String comEva) {
        this.comEva = comEva;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getIdPositive() {
        return idPositive;
    }

    public void setIdPositive(String idPositive) {
        this.idPositive = idPositive;
    }

    public String getIdReverse() {
        return idReverse;
    }

    public void setIdReverse(String idReverse) {
        this.idReverse = idReverse;
    }

    public String getJobCertifi() {
        return jobCertifi;
    }

    public void setJobCertifi(String jobCertifi) {
        this.jobCertifi = jobCertifi;
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1;
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2;
    }

    public String getEduStartDate1() {
        return eduStartDate1;
    }

    public void setEduStartDate1(String eduStartDate1) {
        this.eduStartDate1 = eduStartDate1;
    }

    public String getEduEndDate1() {
        return eduEndDate1;
    }

    public void setEduEndDate1(String eduEndDate1) {
        this.eduEndDate1 = eduEndDate1;
    }

    public String getSchool1() {
        return school1;
    }

    public void setSchool1(String school1) {
        this.school1 = school1;
    }

    public String getEducation1() {
        return education1;
    }

    public void setEducation1(String education1) {
        this.education1 = education1;
    }

    public String getEduSource1() {
        return eduSource1;
    }

    public void setEduSource1(String eduSource1) {
        this.eduSource1 = eduSource1;
    }

    public String getSchoolAddr1() {
        return schoolAddr1;
    }

    public void setSchoolAddr1(String schoolAddr1) {
        this.schoolAddr1 = schoolAddr1;
    }

    public String getEduStartDate2() {
        return eduStartDate2;
    }

    public void setEduStartDate2(String eduStartDate2) {
        this.eduStartDate2 = eduStartDate2;
    }

    public String getEduEndDate2() {
        return eduEndDate2;
    }

    public void setEduEndDate2(String eduEndDate2) {
        this.eduEndDate2 = eduEndDate2;
    }

    public String getSchool2() {
        return school2;
    }

    public void setSchool2(String school2) {
        this.school2 = school2;
    }

    public String getEducation2() {
        return education2;
    }

    public void setEducation2(String education2) {
        this.education2 = education2;
    }

    public String getEduSource2() {
        return eduSource2;
    }

    public void setEduSource2(String eduSource2) {
        this.eduSource2 = eduSource2;
    }

    public String getSchoolAddr2() {
        return schoolAddr2;
    }

    public void setSchoolAddr2(String schoolAddr2) {
        this.schoolAddr2 = schoolAddr2;
    }

    public String getWorkStartDate1() {
        return workStartDate1;
    }

    public void setWorkStartDate1(String workStartDate1) {
        this.workStartDate1 = workStartDate1;
    }

    public String getWorkEndDate1() {
        return workEndDate1;
    }

    public void setWorkEndDate1(String workEndDate1) {
        this.workEndDate1 = workEndDate1;
    }

    public String getWorkUnit1() {
        return workUnit1;
    }

    public void setWorkUnit1(String workUnit1) {
        this.workUnit1 = workUnit1;
    }

    public String getPost1() {
        return post1;
    }

    public void setPost1(String post1) {
        this.post1 = post1;
    }

    public String getLeaving1() {
        return leaving1;
    }

    public void setLeaving1(String leaving1) {
        this.leaving1 = leaving1;
    }

    public String getWitPhone1() {
        return witPhone1;
    }

    public void setWitPhone1(String witPhone1) {
        this.witPhone1 = witPhone1;
    }

    public String getWorkStartDate2() {
        return workStartDate2;
    }

    public void setWorkStartDate2(String workStartDate2) {
        this.workStartDate2 = workStartDate2;
    }

    public String getWorkEndDate2() {
        return workEndDate2;
    }

    public void setWorkEndDate2(String workEndDate2) {
        this.workEndDate2 = workEndDate2;
    }

    public String getWorkUnit2() {
        return workUnit2;
    }

    public void setWorkUnit2(String workUnit2) {
        this.workUnit2 = workUnit2;
    }

    public String getPost2() {
        return post2;
    }

    public void setPost2(String post2) {
        this.post2 = post2;
    }

    public String getLeaving2() {
        return leaving2;
    }

    public void setLeaving2(String leaving2) {
        this.leaving2 = leaving2;
    }

    public String getWitPhone2() {
        return witPhone2;
    }

    public void setWitPhone2(String witPhone2) {
        this.witPhone2 = witPhone2;
    }

    public String getWorkStartDate3() {
        return workStartDate3;
    }

    public void setWorkStartDate3(String workStartDate3) {
        this.workStartDate3 = workStartDate3;
    }

    public String getWorkEndDate3() {
        return workEndDate3;
    }

    public void setWorkEndDate3(String workEndDate3) {
        this.workEndDate3 = workEndDate3;
    }

    public String getWorkUnit3() {
        return workUnit3;
    }

    public void setWorkUnit3(String workUnit3) {
        this.workUnit3 = workUnit3;
    }

    public String getPost3() {
        return post3;
    }

    public void setPost3(String post3) {
        this.post3 = post3;
    }

    public String getLeaving3() {
        return leaving3;
    }

    public void setLeaving3(String leaving3) {
        this.leaving3 = leaving3;
    }

    public String getWitPhone3() {
        return witPhone3;
    }

    public void setWitPhone3(String witPhone3) {
        this.witPhone3 = witPhone3;
    }

    public String getWorkStartDate4() {
        return workStartDate4;
    }

    public void setWorkStartDate4(String workStartDate4) {
        this.workStartDate4 = workStartDate4;
    }

    public String getWorkEndDate4() {
        return workEndDate4;
    }

    public void setWorkEndDate4(String workEndDate4) {
        this.workEndDate4 = workEndDate4;
    }

    public String getWorkUnit4() {
        return workUnit4;
    }

    public void setWorkUnit4(String workUnit4) {
        this.workUnit4 = workUnit4;
    }

    public String getPost4() {
        return post4;
    }

    public void setPost4(String post4) {
        this.post4 = post4;
    }

    public String getLeaving4() {
        return leaving4;
    }

    public void setLeaving4(String leaving4) {
        this.leaving4 = leaving4;
    }

    public String getWitPhone4() {
        return witPhone4;
    }

    public void setWitPhone4(String witPhone4) {
        this.witPhone4 = witPhone4;
    }

    public String getTrainDate1() {
        return trainDate1;
    }

    public void setTrainDate1(String trainDate1) {
        this.trainDate1 = trainDate1;
    }

    public String getTrainPlace1() {
        return trainPlace1;
    }

    public void setTrainPlace1(String trainPlace1) {
        this.trainPlace1 = trainPlace1;
    }

    public String getTrainCon1() {
        return trainCon1;
    }

    public void setTrainCon1(String trainCon1) {
        this.trainCon1 = trainCon1;
    }

    public String getTrainDate2() {
        return trainDate2;
    }

    public void setTrainDate2(String trainDate2) {
        this.trainDate2 = trainDate2;
    }

    public String getTrainPlace2() {
        return trainPlace2;
    }

    public void setTrainPlace2(String trainPlace2) {
        this.trainPlace2 = trainPlace2;
    }

    public String getTrainCon2() {
        return trainCon2;
    }

    public void setTrainCon2(String trainCon2) {
        this.trainCon2 = trainCon2;
    }

    public String getTrainDate3() {
        return trainDate3;
    }

    public void setTrainDate3(String trainDate3) {
        this.trainDate3 = trainDate3;
    }

    public String getTrainPlace3() {
        return trainPlace3;
    }

    public void setTrainPlace3(String trainPlace3) {
        this.trainPlace3 = trainPlace3;
    }

    public String getTrainCon3() {
        return trainCon3;
    }

    public void setTrainCon3(String trainCon3) {
        this.trainCon3 = trainCon3;
    }

    public String getTrainDate4() {
        return trainDate4;
    }

    public void setTrainDate4(String trainDate4) {
        this.trainDate4 = trainDate4;
    }

    public String getTrainPlace4() {
        return trainPlace4;
    }

    public void setTrainPlace4(String trainPlace4) {
        this.trainPlace4 = trainPlace4;
    }

    public String getTrainCon4() {
        return trainCon4;
    }

    public void setTrainCon4(String trainCon4) {
        this.trainCon4 = trainCon4;
    }

    public String getAwardDate1() {
        return awardDate1;
    }

    public void setAwardDate1(String awardDate1) {
        this.awardDate1 = awardDate1;
    }

    public String getAwardPlace1() {
        return awardPlace1;
    }

    public void setAwardPlace1(String awardPlace1) {
        this.awardPlace1 = awardPlace1;
    }

    public String getAwardCon1() {
        return awardCon1;
    }

    public void setAwardCon1(String awardCon1) {
        this.awardCon1 = awardCon1;
    }

    public String getAwardDate2() {
        return awardDate2;
    }

    public void setAwardDate2(String awardDate2) {
        this.awardDate2 = awardDate2;
    }

    public String getAwardPlace2() {
        return awardPlace2;
    }

    public void setAwardPlace2(String awardPlace2) {
        this.awardPlace2 = awardPlace2;
    }

    public String getAwardCon2() {
        return awardCon2;
    }

    public void setAwardCon2(String awardCon2) {
        this.awardCon2 = awardCon2;
    }

    public String getAwardDate3() {
        return awardDate3;
    }

    public void setAwardDate3(String awardDate3) {
        this.awardDate3 = awardDate3;
    }

    public String getAwardPlace3() {
        return awardPlace3;
    }

    public void setAwardPlace3(String awardPlace3) {
        this.awardPlace3 = awardPlace3;
    }

    public String getAwardCon3() {
        return awardCon3;
    }

    public void setAwardCon3(String awardCon3) {
        this.awardCon3 = awardCon3;
    }

    public String getAwardDate4() {
        return awardDate4;
    }

    public void setAwardDate4(String awardDate4) {
        this.awardDate4 = awardDate4;
    }

    public String getAwardPlace4() {
        return awardPlace4;
    }

    public void setAwardPlace4(String awardPlace4) {
        this.awardPlace4 = awardPlace4;
    }

    public String getAwardCon4() {
        return awardCon4;
    }

    public void setAwardCon4(String awardCon4) {
        this.awardCon4 = awardCon4;
    }

    public String getRelation1() {
        return relation1;
    }

    public void setRelation1(String relation1) {
        this.relation1 = relation1;
    }

    public String getFamilyName1() {
        return familyName1;
    }

    public void setFamilyName1(String familyName1) {
        this.familyName1 = familyName1;
    }

    public String getFamilyPhone1() {
        return familyPhone1;
    }

    public void setFamilyPhone1(String familyPhone1) {
        this.familyPhone1 = familyPhone1;
    }

    public String getFamilyWorkUnit1() {
        return familyWorkUnit1;
    }

    public void setFamilyWorkUnit1(String familyWorkUnit1) {
        this.familyWorkUnit1 = familyWorkUnit1;
    }

    public String getRelation2() {
        return relation2;
    }

    public void setRelation2(String relation2) {
        this.relation2 = relation2;
    }

    public String getFamilyName2() {
        return familyName2;
    }

    public void setFamilyName2(String familyName2) {
        this.familyName2 = familyName2;
    }

    public String getFamilyPhone2() {
        return familyPhone2;
    }

    public void setFamilyPhone2(String familyPhone2) {
        this.familyPhone2 = familyPhone2;
    }

    public String getFamilyWorkUnit2() {
        return familyWorkUnit2;
    }

    public void setFamilyWorkUnit2(String familyWorkUnit2) {
        this.familyWorkUnit2 = familyWorkUnit2;
    }

    @Override
    public String toString() {
        return "UsersInfoT{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", idCard='" + idCard + '\'' +
                ", nation='" + nation + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", phone='" + phone + '\'' +
                ", education='" + education + '\'' +
                ", health='" + health + '\'' +
                ", marital='" + marital + '\'' +
                ", typeWork='" + typeWork + '\'' +
                ", addr='" + addr + '\'' +
                ", selfEva='" + selfEva + '\'' +
                ", comEva='" + comEva + '\'' +
                ", state=" + state +
                ", avatar='" + avatar + '\'' +
                ", idPositive='" + idPositive + '\'' +
                ", idReverse='" + idReverse + '\'' +
                ", jobCertifi='" + jobCertifi + '\'' +
                ", other1='" + other1 + '\'' +
                ", other2='" + other2 + '\'' +
                ", eduStartDate1='" + eduStartDate1 + '\'' +
                ", eduEndDate1='" + eduEndDate1 + '\'' +
                ", school1='" + school1 + '\'' +
                ", education1='" + education1 + '\'' +
                ", eduSource1='" + eduSource1 + '\'' +
                ", schoolAddr1='" + schoolAddr1 + '\'' +
                ", eduStartDate2='" + eduStartDate2 + '\'' +
                ", eduEndDate2='" + eduEndDate2 + '\'' +
                ", school2='" + school2 + '\'' +
                ", education2='" + education2 + '\'' +
                ", eduSource2='" + eduSource2 + '\'' +
                ", schoolAddr2='" + schoolAddr2 + '\'' +
                ", workStartDate1='" + workStartDate1 + '\'' +
                ", workEndDate1='" + workEndDate1 + '\'' +
                ", workUnit1='" + workUnit1 + '\'' +
                ", post1='" + post1 + '\'' +
                ", leaving1='" + leaving1 + '\'' +
                ", witPhone1='" + witPhone1 + '\'' +
                ", workStartDate2='" + workStartDate2 + '\'' +
                ", workEndDate2='" + workEndDate2 + '\'' +
                ", workUnit2='" + workUnit2 + '\'' +
                ", post2='" + post2 + '\'' +
                ", leaving2='" + leaving2 + '\'' +
                ", witPhone2='" + witPhone2 + '\'' +
                ", workStartDate3='" + workStartDate3 + '\'' +
                ", workEndDate3='" + workEndDate3 + '\'' +
                ", workUnit3='" + workUnit3 + '\'' +
                ", post3='" + post3 + '\'' +
                ", leaving3='" + leaving3 + '\'' +
                ", witPhone3='" + witPhone3 + '\'' +
                ", workStartDate4='" + workStartDate4 + '\'' +
                ", workEndDate4='" + workEndDate4 + '\'' +
                ", workUnit4='" + workUnit4 + '\'' +
                ", post4='" + post4 + '\'' +
                ", leaving4='" + leaving4 + '\'' +
                ", witPhone4='" + witPhone4 + '\'' +
                ", trainDate1='" + trainDate1 + '\'' +
                ", trainPlace1='" + trainPlace1 + '\'' +
                ", trainCon1='" + trainCon1 + '\'' +
                ", trainDate2='" + trainDate2 + '\'' +
                ", trainPlace2='" + trainPlace2 + '\'' +
                ", trainCon2='" + trainCon2 + '\'' +
                ", trainDate3='" + trainDate3 + '\'' +
                ", trainPlace3='" + trainPlace3 + '\'' +
                ", trainCon3='" + trainCon3 + '\'' +
                ", trainDate4='" + trainDate4 + '\'' +
                ", trainPlace4='" + trainPlace4 + '\'' +
                ", trainCon4='" + trainCon4 + '\'' +
                ", awardDate1='" + awardDate1 + '\'' +
                ", awardPlace1='" + awardPlace1 + '\'' +
                ", awardCon1='" + awardCon1 + '\'' +
                ", awardDate2='" + awardDate2 + '\'' +
                ", awardPlace2='" + awardPlace2 + '\'' +
                ", awardCon2='" + awardCon2 + '\'' +
                ", awardDate3='" + awardDate3 + '\'' +
                ", awardPlace3='" + awardPlace3 + '\'' +
                ", awardCon3='" + awardCon3 + '\'' +
                ", awardDate4='" + awardDate4 + '\'' +
                ", awardPlace4='" + awardPlace4 + '\'' +
                ", awardCon4='" + awardCon4 + '\'' +
                ", relation1='" + relation1 + '\'' +
                ", familyName1='" + familyName1 + '\'' +
                ", familyPhone1='" + familyPhone1 + '\'' +
                ", familyWorkUnit1='" + familyWorkUnit1 + '\'' +
                ", relation2='" + relation2 + '\'' +
                ", familyName2='" + familyName2 + '\'' +
                ", familyPhone2='" + familyPhone2 + '\'' +
                ", familyWorkUnit2='" + familyWorkUnit2 + '\'' +
                '}';
    }
}
