package com.yhtos.talent.bean;

import java.sql.Date;

/**
 * 类名：TrainExperienceT
 * 功能：tb_train_experience 用户培训经历表映射
 * 创建人：star
 * 创建时间：2019/12/2
 * 修改时间：
 */
public class TrainExperienceT extends TableF{


    private Date trainDate;     //培训时间
    private String trainPlace;  //培训机构
    private String trainCon;    //培训内容

    public TrainExperienceT(String username, Date trainDate, String trainPlace, String trainCon) {
        super(username);
        this.trainDate = trainDate;
        this.trainPlace = trainPlace;
        this.trainCon = trainCon;
    }

    public TrainExperienceT(int id, Date slamp, String username, Date trainDate,
                            String trainPlace, String trainCon) {
        super(id, slamp, username);
        this.trainDate = trainDate;
        this.trainPlace = trainPlace;
        this.trainCon = trainCon;
    }

    public Date getTrainDate() {
        return trainDate;
    }

    public void setTrainDate(Date trainDate) {
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
