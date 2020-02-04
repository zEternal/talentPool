package com.yhtos.talent.dao.impl;

import com.yhtos.talent.bean.TableF;
import com.yhtos.talent.bean.UsersInfoT;
import com.yhtos.talent.dao.UserDAO;
import com.yhtos.talent.util.DBUtil;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 类名：UsersInfoDAOImpl
 * 功能：tb_userInfo表数据库操作类
 * 创建人：star
 * 创建时间：20
 * 修改时间：
 */
public class UsersInfoDAOImpl implements UserDAO<UsersInfoT> {

    @Override
    public int save(UsersInfoT usersInfoT) {
        int statusCode = 0;//状态码

        //1-16   state
        //17-28 教育背景
        //29-52 工作经历
        //53-62 培训经历  -64    +2
        //63-74 资格证书
        //75-82 家庭成员
        //83当前日期
        /**String sql = "insert into tb_userInfo_all (null,?,?,?,?,?,?,?,?,?,?,?, ?,?,?,?,?,?,?,     null,null,null,null,null,null,     ?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?,?,?,?, ?,?,?,?,?,?,?,?,?,?, ?,?,?,?,?,?,?,?,?,?, ?,?,?,?,?,?,?,?,?,?, ?,?,?,?,?,?,?,?,?,?," +
                "?,?,?,?,?,?,?,?,?,?,?)";*/


        String sql = "insert into tb_userInfo_all values(null,?,?,?,?,?,?,?,?,?,?,?, ?,?,?,?,?,?,   ?,?,?,?,?,?,    " +
                "?,?,?,?,?,?,?,?,?,?,?,?,   ?,?,?,?,?,?,?,?,?,?,?,?, null,null,null,null,null,null,null,null,null,null,null,null," +
                "?,?,?,?,?,?,?,?,?,?,?,?,   ?,?,?,?,?,?,?,?,?,?,?,?,  ?,?,?,?,?,?,?,?,  ?)";
        List<Object> params=new ArrayList<Object>();
        {
            params.add(usersInfoT.getUsername());
            params.add(usersInfoT.getName());
            params.add(usersInfoT.getBirthday());/**/
            params.add(usersInfoT.getSex());
            params.add(usersInfoT.getIdCard());
            params.add(usersInfoT.getNation());
            params.add(usersInfoT.getHeight());
            params.add(usersInfoT.getWeight());
            params.add(usersInfoT.getPhone());
            params.add(usersInfoT.getEducation());
            params.add(usersInfoT.getHealth());
            params.add(usersInfoT.getMarital());
            params.add(usersInfoT.getTypeWork());
            params.add(usersInfoT.getAddr());
            params.add(usersInfoT.getSelfEva());
            params.add(usersInfoT.getComEva());
            params.add(usersInfoT.getState());
            //////////17
            params.add(null);
            params.add(null);
            params.add(null);
            params.add(null);
            params.add(null);
            params.add(null);

        /////17-28
        params.add(usersInfoT.getEduStartDate1());
        params.add(usersInfoT.getEduEndDate1());
        params.add(usersInfoT.getSchool1());
        params.add(usersInfoT.getEducation1());
        params.add(usersInfoT.getEduSource1());
        params.add(usersInfoT.getSchoolAddr1());
        params.add(usersInfoT.getEduStartDate2());
        params.add(usersInfoT.getEduEndDate2());
        params.add(usersInfoT.getSchool2());
        params.add(usersInfoT.getEducation2());
        params.add(usersInfoT.getEduSource2());
        params.add(usersInfoT.getSchoolAddr2());

        //29-52
        params.add(usersInfoT.getWorkStartDate1());
        params.add(usersInfoT.getWorkEndDate1());
        params.add(usersInfoT.getWorkUnit1());
        params.add(usersInfoT.getPost1());
        params.add(usersInfoT.getLeaving1());
        params.add(usersInfoT.getWitPhone1());
        params.add(usersInfoT.getWorkStartDate2());
        params.add(usersInfoT.getWorkEndDate2());
        params.add(usersInfoT.getWorkUnit2());
        params.add(usersInfoT.getPost2());
        params.add(usersInfoT.getLeaving2());
        params.add(usersInfoT.getWitPhone2());
        /*params.add(usersInfoT.getWorkStartDate3());
        params.add(usersInfoT.getWorkEndDate3());
        params.add(usersInfoT.getWorkUnit3());
        params.add(usersInfoT.getPost3());
        params.add(usersInfoT.getLeaving3());
        params.add(usersInfoT.getWitPhone3());
        params.add(usersInfoT.getWorkStartDate4());
        params.add(usersInfoT.getWorkEndDate4());
        params.add(usersInfoT.getWorkUnit4());
        params.add(usersInfoT.getPost4());
        params.add(usersInfoT.getLeaving4());
        params.add(usersInfoT.getWitPhone4());*/

        //53-62
        params.add(usersInfoT.getTrainDate1());
        params.add(usersInfoT.getTrainPlace1());
        params.add(usersInfoT.getTrainCon1());
        params.add(usersInfoT.getTrainDate2());
        params.add(usersInfoT.getTrainPlace2());
        params.add(usersInfoT.getTrainCon2());
        params.add(usersInfoT.getTrainDate3());
        params.add(usersInfoT.getTrainPlace3());
        params.add(usersInfoT.getTrainCon3());
        params.add(usersInfoT.getTrainDate4());
        params.add(usersInfoT.getTrainPlace4());
        params.add(usersInfoT.getTrainCon4());
        }
        //63-74
        params.add(usersInfoT.getAwardDate1());
        params.add(usersInfoT.getAwardPlace1());
        params.add(usersInfoT.getAwardCon1());
        params.add(usersInfoT.getAwardDate2());
        params.add(usersInfoT.getAwardPlace2());
        params.add(usersInfoT.getAwardCon2());
        params.add(usersInfoT.getAwardDate3());
        params.add(usersInfoT.getAwardPlace3());
        params.add(usersInfoT.getAwardCon3());
        params.add(usersInfoT.getAwardDate4());
        params.add(usersInfoT.getAwardPlace4());
        params.add(usersInfoT.getAwardCon4());
        //75-82
        params.add(usersInfoT.getRelation1());
        params.add(usersInfoT.getFamilyName1());
        params.add(usersInfoT.getFamilyPhone1());
        params.add(usersInfoT.getFamilyWorkUnit1());
        params.add(usersInfoT.getRelation2());
        params.add(usersInfoT.getFamilyName2());
        params.add(usersInfoT.getFamilyPhone2());
        params.add(usersInfoT.getFamilyWorkUnit2());
        Date date=new Date();   //这里的时util包下的
        SimpleDateFormat temp=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //这是24时
        String Date=temp.format(date);
        params.add(Date);

        try {
            statusCode = DBUtil.executeUpdate(sql,params);
            System.out.println("！！！");
        } catch (Exception e) {
            System.out.println("数据插入异常！！！");
            e.printStackTrace();
        }

        return statusCode;
    }


    public int imgSave(Map map,String username){
        int statusCode = 0;//状态码

        String sql = "update tb_userInfo_all set avatar=?,idPositive=?,idReverse=?,jobCertifi=?,other1=?,other2=? where " +
                "username=?";
        List<Object> params=new ArrayList<Object>();
        params.add(map.get("avatar"));
        params.add(map.get("idPositive"));
        params.add(map.get("idReverse"));
        params.add(map.get("jobCertifi"));
        params.add(map.get("other1"));
        params.add(map.get("other2"));
        params.add(username);

        statusCode = DBUtil.executeUpdate(sql,params);
        return statusCode;
    }

    @Override
    public int remove(String username) {
        return 0;
    }

    @Override
    public int removeMany(List<String> list) {
        return 0;
    }

    @Override
    public int update(UsersInfoT usersInfoT) {
        return 0;
    }

    @Override
    public UsersInfoT findByUsername(String username) {
        return null;
    }

    @Override
    public List<UsersInfoT> findAll() {
        return null;
    }
}
