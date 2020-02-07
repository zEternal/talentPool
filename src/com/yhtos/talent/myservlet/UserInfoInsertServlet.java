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
@WebServlet(name = "UserInfoInsertServlet", urlPatterns = "/UserInfoInsertServlet")
public class UserInfoInsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html,charset=utf-8");
        String username = null;
        String name = null;        //姓名
        String birthday = null;
        int sex = 0;        //性别
        String idCard = null;      //身份证号
        String nation = null;      //民族
        float height = 0;       //身高
        float weight = 0;       //体重
        String phone = null;       //电话
        String education = null;   //学历
        String health = null;      //健康状况
        String marital = null;     //婚姻状况
        String typeWork = null;    //工种
        String addr = null;        //现住地址
        String selfEva = null;     //自我评价
        String comEva = null;      //公司评价
        String eduStartDate1 = null;
        String eduEndDate1 = null;
        String school1 = null;
        String education1 = null;
        String eduSource1 = null;
        String schoolAddr1 = null;
        String eduStartDate2 = null;
        String eduEndDate2 = null;
        String school2 = null;
        String education2 = null;
        String eduSource2 = null;
        String schoolAddr2 = null;
        String workStartDate1 = null;
        String workEndDate1 = null;
        String workUnit1 = null;
        String post1 = null;
        String leaving1 = null;
        String witPhone1 = null;
        String workStartDate2 = null;
        String workEndDate2 = null;
        String workUnit2 = null;
        String post2 = null;
        String leaving2 = null;
        String witPhone2 = null;
        String trainDate1 = null;
        String trainPlace1 = null;
        String trainCon1 = null;
        String trainDate2 = null;
        String trainPlace2 = null;
        String trainCon2 = null;
        String trainDate3 = null;
        String trainPlace3 = null;
        String trainCon3 = null;
        String trainDate4 = null;
        String trainPlace4 = null;
        String trainCon4 = null;
        String awardDate1 = null;
        String awardPlace1 = null;
        String awardCon1 = null;
        String awardDate2 = null;
        String awardPlace2 = null;
        String awardCon2 = null;
        String awardDate3 = null;
        String awardPlace3 = null;
        String awardCon3 = null;
        String awardDate4 = null;
        String awardPlace4 = null;
        String awardCon4 = null;
        String relation1 = null;
        String familyName1 = null;
        String familyPhone1 = null;
        String familyWorkUnit1 = null;
        String relation2 = null;
        String familyName2 = null;
        String familyPhone2 = null;
        String familyWorkUnit2 = null;
        try {
            System.out.println("----------------------------------------");
            username = (String)request.getSession().getAttribute("username");
            username = "jian451343789";
            name = request.getParameter("name");
            birthday = request.getParameter("birthday");
            System.out.println("name--" + name);
            sex = Integer.parseInt(request.getParameter("sex"));
            System.out.println("sex--" + sex);
            idCard = request.getParameter("idCard");
            System.out.println("idCard--" + idCard);
            nation = request.getParameter("nation");
            System.out.println("nation--" + nation);
            height = Float.parseFloat(request.getParameter("height"));
            System.out.println("height--" + request.getParameter("height"));
            weight = Float.parseFloat(request.getParameter("weight"));
            System.out.println("weight--" + request.getParameter("weight"));
            phone = request.getParameter("phone");
            System.out.println("phone--" + phone);
            education = request.getParameter("education");
            System.out.println("education--" + education);
            health = request.getParameter("health");
            System.out.println("health--" + health);
            marital = request.getParameter("marital");
            System.out.println("marital--" + marital);
            typeWork = request.getParameter("typeWork");
            System.out.println("typeWork--" + typeWork);
            addr = request.getParameter("addr");
            System.out.println("addr--" + addr);
            selfEva = request.getParameter("selfEva");
            System.out.println("selfEva--" + selfEva);
            comEva = request.getParameter("comEva");
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        /*
        String avatar = request.getParameter("avatar");      //头像路径
        String idPositive = request.getParameter("idPositive");  //身份证正面
        String idReverse = request.getParameter("idReverse");   //身份证反面
        String jobCertifi = request.getParameter("jobCertifi");  //职业证书
        String other1 = request.getParameter("other1");      //其他证书1
        String other2 = request.getParameter("other2");      //其他证书2
        */
            eduStartDate1 = request.getParameter("eduStartDate1");
            eduEndDate1 = request.getParameter("eduEndDate1");
            school1 = request.getParameter("school1");
            education1 = request.getParameter("education1");
            eduSource1 = request.getParameter("eduSource1");
            schoolAddr1 = request.getParameter("schoolAddr1");
            eduStartDate2 = request.getParameter("eduStartDate2");
            eduEndDate2 = request.getParameter("eduEndDate2");
            school2 = request.getParameter("school2");
            education2 = request.getParameter("education2");
            eduSource2 = request.getParameter("eduSource2");
            schoolAddr2 = request.getParameter("schoolAddr2");
            //工作经历
            workStartDate1 = request.getParameter("workStartDate1");
            workEndDate1 = request.getParameter("workEndDate1");
            workUnit1 = request.getParameter("workUnit1");
            post1 = request.getParameter("post1");
            leaving1 = request.getParameter("leaving1");
            witPhone1 = request.getParameter("witPhone1");
            workStartDate2 = request.getParameter("workStartDate2");
            workEndDate2 = request.getParameter("workEndDate2");
            workUnit2 = request.getParameter("workUnit2");
            post2 = request.getParameter("post2");
            leaving2 = request.getParameter("leaving2");
            witPhone2 = request.getParameter("witPhone2");
        /*String workStartDate3 = request.getParameter("workStartDate3");
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
        String witPhone4 = request.getParameter("witPhone4");*/
            //培训经历
            trainDate1 = request.getParameter("trainDate1");
            trainPlace1 = request.getParameter("trainPlace1");
            trainCon1 = request.getParameter("trainCon1");
            trainDate2 = request.getParameter("trainDate2");
            trainPlace2 = request.getParameter("trainPlace2");
            trainCon2 = request.getParameter("trainCon2");
            trainDate3 = request.getParameter("trainDate3");
            trainPlace3 = request.getParameter("trainPlace3");
            trainCon3 = request.getParameter("trainCon3");
            trainDate4 = request.getParameter("trainDate4");
            trainPlace4 = request.getParameter("trainPlace4");
            trainCon4 = request.getParameter("trainCon4");
            //资格证书
            awardDate1 = request.getParameter("awardDate1");
            awardPlace1 = request.getParameter("awardPlace1");
            awardCon1 = request.getParameter("awardCon1");
            awardDate2 = request.getParameter("awardDate2");
            awardPlace2 = request.getParameter("awardPlace2");
            awardCon2 = request.getParameter("awardCon2");
            awardDate3 = request.getParameter("awardDate3");
            awardPlace3 = request.getParameter("awardPlace3");
            awardCon3 = request.getParameter("awardCon3");
            awardDate4 = request.getParameter("awardDate4");
            awardPlace4 = request.getParameter("awardPlace4");
            awardCon4 = request.getParameter("awardCon4");
            //家庭成员
            relation1 = request.getParameter("relation1");
            familyName1 = request.getParameter("familyName1");
            familyPhone1 = request.getParameter("familyPhone1");
            familyWorkUnit1 = request.getParameter("familyWorkUnit1");
            relation2 = request.getParameter("relation2");
            familyName2 = request.getParameter("familyName2");
            familyPhone2 = request.getParameter("familyPhone2");
            familyWorkUnit2 = request.getParameter("familyWorkUnit2");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        UsersInfoT use = new UsersInfoT(username, name,birthday,  sex,  idCard,  nation,  height,
                weight,  phone,  education,  health,  marital,  typeWork,
                addr,  selfEva,  comEva, 0,  null,  null,
                null,  null,  null,  null,  eduStartDate1,
                eduEndDate1,  school1,  education1,  eduSource1,  schoolAddr1,
                 eduStartDate2,  eduEndDate2,  school2,  education2,  eduSource2,
                 schoolAddr2,  workStartDate1,  workEndDate1,  workUnit1,  post1,
                 leaving1,  witPhone1,  workStartDate2,  workEndDate2,  workUnit2,
                 post2,  leaving2,  witPhone2,  /*workStartDate3,  workEndDate3,
                 workUnit3,  post3,  leaving3,  witPhone3,  workStartDate4,
                 workEndDate4,  workUnit4,  post4,  leaving4,  witPhone4,*/
                 null,null,null,null,null,null,null,null,null,null,null,null,
                 trainDate1,  trainPlace1,  trainCon1,  trainDate2,  trainPlace2,
                 trainCon2,  trainDate3,  trainPlace3,  trainCon3,  trainDate4,
                 trainPlace4,  trainCon4,  awardDate1,  awardPlace1,  awardCon1,
                 awardDate2,  awardPlace2,  awardCon2,  awardDate3,  awardPlace3,
                 awardCon3,  awardDate4,  awardPlace4,  awardCon4,  relation1,
                 familyName1,  familyPhone1,  familyWorkUnit1,  relation2,
                 familyName2,  familyPhone2,  familyWorkUnit2);

        System.out.println("usernaem--" + username);
        System.out.println(use.toString());
        UsersInfoDAOImpl ud = new UsersInfoDAOImpl();
        int n = ud.save(use);
        int statu = 4;
        if (n > 0){
            statu = 10;
            System.out.println("数据存储成功");
        }
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
