package com.yhtos.talent.bean;

/**
 * 类名：QualificationT
 * 功能：tb_qualification 用户资格证书表映射
 * 创建人：star
 * 创建时间：2019/12/3
 * 修改时间：
 */
public class QualificationT extends TableF {

    private String trainDate;     //颁发时间
    private String trainPlace;  //证书名称
    private String trainCon;    //颁发机构

    public QualificationT(String username, String trainDate, String trainPlace, String trainCon) {
        super(username);
        this.trainDate = trainDate;
        this.trainPlace = trainPlace;
        this.trainCon = trainCon;
    }

    public QualificationT(int id, String slamp, String username, String trainDate, String trainPlace,
                          String trainCon) {
        super(id, slamp, username);
        this.trainDate = trainDate;
        this.trainPlace = trainPlace;
        this.trainCon = trainCon;
    }

    public String getTrainDate() {
        return trainDate;
    }

    public void setTrainDate(String trainDate) {
        this.trainDate = trainDate;
    }

    public String getTrainPlace() {
        return trainPlace;
    }

    public void setTrainPlace(String trainPlace) {
        this.trainPlace = trainPlace;
    }

    public String getTrainCon() {
        return trainCon;
    }

    public void setTrainCon(String trainCon) {
        this.trainCon = trainCon;
    }
}
