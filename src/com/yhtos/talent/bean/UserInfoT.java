package com.yhtos.talent.bean;


/**
 * 类名：UserInfoT
 * 功能：tb_userInfo 用户信息表映射
 * 创建人：star
 * 创建时间：2019/12/2
 * 修改时间：
 */
public class UserInfoT extends TableF{

    private String name;        //姓名
    private boolean sex;        //性别
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
    private boolean state;      //审核状态
    private String avatar;      //头像路径
    private String idPositive;  //身份证正面
    private String idReverse;   //身份证反面
    private String jobCertifi;  //职业证书
    private String other1;      //其他证书1
    private String other2;      //其他证书2

    public UserInfoT(String username, String name, boolean sex, String idCard, String nation,
                     float height, float weight, String phone, String education, String health,
                     String marital, String typeWork, String addr, String selfEva, String comEva,
                     boolean state, String avatar, String idPositive, String idReverse,
                     String jobCertifi, String other1, String other2) {
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
    }

    public UserInfoT(int id, String slamp, String username, String name, boolean sex, String idCard,
                     String nation, float height, float weight, String phone, String education,
                     String health, String marital, String typeWork, String addr, String selfEva,
                     String comEva, boolean state, String avatar, String idPositive, String idReverse,
                     String jobCertifi, String other1, String other2) {
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
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
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

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
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
}
