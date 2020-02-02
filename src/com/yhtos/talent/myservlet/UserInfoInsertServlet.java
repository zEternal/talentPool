package com.yhtos.talent.myservlet;

import com.yhtos.talent.bean.UsersInfoT;
import com.yhtos.talent.dao.impl.UsersInfoDAOImpl;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 类名：UserInfoInsertServlet
 * 功能：tb_userInfo 插入用户信息
 * 创建人：star
 * 创建时间：2019/
 * 修改时间：2020/2/2
 */
@WebServlet("/UserInfoInsertServlet")
public class UserInfoInsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html,charset=utf-8");
        String username = request.getParameter("username");
        String name = request.getParameter("name");        //姓名
        boolean sex = Boolean.parseBoolean(request.getParameter("sex"));        //性别
        String idCard = request.getParameter("idCard");      //身份证号
        String nation = request.getParameter("nation");      //民族
        float height = Float.parseFloat(request.getParameter("height"));       //身高
        float weight = Float.parseFloat(request.getParameter("weight"));       //体重
        String phone = request.getParameter("phone");       //电话
        String education = request.getParameter("education");   //学历
        String health = request.getParameter("health");      //健康状况
        String marital = request.getParameter("marital");     //婚姻状况
        String typeWork = request.getParameter("typeWork");    //工种
        String addr = request.getParameter("addr");        //现住地址
        String selfEva = request.getParameter("selfEva");     //自我评价
        String comEva = request.getParameter("comEva");      //公司评价
        /*
        String avatar = request.getParameter("avatar");      //头像路径
        String idPositive = request.getParameter("idPositive");  //身份证正面
        String idReverse = request.getParameter("idReverse");   //身份证反面
        String jobCertifi = request.getParameter("jobCertifi");  //职业证书
        String other1 = request.getParameter("other1");      //其他证书1
        String other2 = request.getParameter("other2");      //其他证书2
        */
        String eduStartDate1 = request.getParameter("eduStartDate1");
        String eduEndDate1 = request.getParameter("eduEndDate1");
        String school1 = request.getParameter("school1");
        String education1 = request.getParameter("education1");
        String eduSource1 = request.getParameter("eduSource1");
        String schoolAddr1 = request.getParameter("schoolAddr1");
        String eduStartDate2 = request.getParameter("eduStartDate2");
        String eduEndDate2 = request.getParameter("eduEndDate2");
        String school2 = request.getParameter("school2");
        String education2 = request.getParameter("education2");
        String eduSource2 = request.getParameter("eduSource2");
        String schoolAddr2 = request.getParameter("schoolAddr2");
        //工作经历
        String workStartDate1 = request.getParameter("workStartDate1");
        String workEndDate1 = request.getParameter("workEndDate1");
        String workUnit1 = request.getParameter("workUnit1");
        String post1 = request.getParameter("post1");
        String leaving1 = request.getParameter("leaving1");
        String witPhone1 = request.getParameter("witPhone1");
        String workStartDate2 = request.getParameter("workStartDate2");
        String workEndDate2 = request.getParameter("workEndDate2");
        String workUnit2 = request.getParameter("workUnit2");
        String post2 = request.getParameter("post2");
        String leaving2 = request.getParameter("leaving2");
        String witPhone2 = request.getParameter("witPhone2");
        String workStartDate3 = request.getParameter("workStartDate3");
        String workEndDate3 = request.getParameter("workEndDate3");
        String workUnit3 = request.getParameter("workUnit3");
        String post3 = request.getParameter("post3");
        String leaving3 = request.getParameter("leaving3");
        String witPhone3 = request.getParameter("witPhone3");
        String workStartDate4 = request.getParameter("workStartDate4");
        String workEndDate4 = request.getParameter("workEndDate4");
        String workUnit4 = request.getParameter("workUnit4");
        String post4 = request.getParameter("post4");
        String leaving4 = request.getParameter("leaving4");
        String witPhone4 = request.getParameter("witPhone4");
        //培训经历
        String trainDate1 = request.getParameter("trainDate1");
        String trainPlace1 = request.getParameter("trainPlace1");
        String trainCon1 = request.getParameter("trainCon1");
        String trainDate2 = request.getParameter("trainDate2");
        String trainPlace2 = request.getParameter("trainPlace2");
        String trainCon2 = request.getParameter("trainCon2");
        String trainDate3 = request.getParameter("trainDate3");
        String trainPlace3 = request.getParameter("trainPlace3");
        String trainCon3 = request.getParameter("trainCon3");
        String trainDate4 = request.getParameter("trainDate4");
        String trainPlace4 = request.getParameter("trainPlace4");
        String trainCon4 = request.getParameter("trainCon4");
        //资格证书
        String awardDate1 = request.getParameter("awardDate1");
        String awardPlace1 = request.getParameter("awardPlace1");
        String awardCon1 = request.getParameter("awardCon1");
        String awardDate2 = request.getParameter("awardDate2");
        String awardPlace2 = request.getParameter("awardPlace2");
        String awardCon2 = request.getParameter("awardCon2");
        String awardDate3 = request.getParameter("awardDate3");
        String awardPlace3 = request.getParameter("awardPlace3");
        String awardCon3 = request.getParameter("awardCon3");
        String awardDate4 = request.getParameter("awardDate4");
        String awardPlace4 = request.getParameter("awardPlace4");
        String awardCon4 = request.getParameter("awardCon4");
        //家庭成员
        String relation1 = request.getParameter("relation1");
        String familyName1 = request.getParameter("familyName1");
        String familyPhone1 = request.getParameter("familyPhone1");
        String familyWorkUnit1 = request.getParameter("familyWorkUnit1");
        String relation2 = request.getParameter("relation2");
        String familyName2 = request.getParameter("familyName2");
        String familyPhone2 = request.getParameter("familyPhone2");
        String familyWorkUnit2 = request.getParameter("familyWorkUnit2");

        UsersInfoT use = new UsersInfoT(username, name,  sex,  idCard,  nation,  height,
                weight,  phone,  education,  health,  marital,  typeWork,
                addr,  selfEva,  comEva, false,  null,  null,
                null,  null,  null,  null,  eduStartDate1,
                eduEndDate1,  school1,  education1,  eduSource1,  schoolAddr1,
                 eduStartDate2,  eduEndDate2,  school2,  education2,  eduSource2,
                 schoolAddr2,  workStartDate1,  workEndDate1,  workUnit1,  post1,
                 leaving1,  witPhone1,  workStartDate2,  workEndDate2,  workUnit2,
                 post2,  leaving2,  witPhone2,  workStartDate3,  workEndDate3,
                 workUnit3,  post3,  leaving3,  witPhone3,  workStartDate4,
                 workEndDate4,  workUnit4,  post4,  leaving4,  witPhone4,
                 trainDate1,  trainPlace1,  trainCon1,  trainDate2,  trainPlace2,
                 trainCon2,  trainDate3,  trainPlace3,  trainCon3,  trainDate4,
                 trainPlace4,  trainCon4,  awardDate1,  awardPlace1,  awardCon1,
                 awardDate2,  awardPlace2,  awardCon2,  awardDate3,  awardPlace3,
                 awardCon3,  awardDate4,  awardPlace4,  awardCon4,  relation1,
                 familyName1,  familyPhone1,  familyWorkUnit1,  relation2,
                 familyName2,  familyPhone2,  familyWorkUnit2);

        UsersInfoDAOImpl ud = new UsersInfoDAOImpl();
        int statu = ud.save(use);

        JSONObject resJson = new JSONObject();
        resJson.put("username",username);
        resJson.put("statu",statu);

        response.getWriter().print(resJson.toString());

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
/**
 * 用户名          username
 * 姓名           name
 * 性别           sex
 * 身份证号        idcard
 * 民族           nation
 * 身高           height
 * 体重           weight
 * 联系方式        phone
 * 学历           education
 * 健康状况        health
 * 婚姻状况        marital
 * 工种           typeWork
 * 现地址          addr
 * 自我评价        selfEva
 * 公司评价        comEva
 * 头像            avatar
 * 身份证正反面     idPositive
 * idReverse
 * 职业证书         jobCertifi
 * 其它证书1/2      other1/2
 * <p>
 * * 教育背景
 * 开始日期1/2       startDate
 * 结束日期1/2       endDate
 * 学校名称1/2       school
 * 学历1/2          education
 * 学历获取方式1/2    eduSource
 * 学校所在地1/2     schoolAddr
 * <p>
 * * 工作经历
 * 开始日期1234      startDate
 * 结束日期1234      endDate
 * 工作单位1234      workUnit
 * 岗位1234         post
 * 离职原因1234      leaving
 * 证明人电话1234    witPhone
 * <p>
 * * 培训经历
 * 培训时间1234     trainDate
 * 培训机构1234     trainPlace
 * 培训内容1234     trainCon
 * <p>
 * * 资格证书
 * 颁发时间1234     trainDate
 * 证书名称1234     trainPlace
 * 颁发机构1234     trainCon
 * <p>
 * * 家庭成员情况
 * 关系12          relation
 * 姓名12          name
 * 联系方式12       phone
 * 工作单位12       workUnit
 */
