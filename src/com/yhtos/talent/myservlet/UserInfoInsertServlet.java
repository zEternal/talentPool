package com.yhtos.talent.myservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
        String avatar = request.getParameter("avatar");      //头像路径
        String idPositive = request.getParameter("idPositive");  //身份证正面
        String idReverse = request.getParameter("idReverse");   //身份证反面
        String jobCertifi = request.getParameter("jobCertifi");  //职业证书
        String other1 = request.getParameter("other1");      //其他证书1
        String other2 = request.getParameter("other2");      //其他证书2

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
 *                idReverse
 * 职业证书         jobCertifi
 * 其它证书1/2      other1/2
 *
 ** 教育背景
 * 开始日期1/2       startDate
 * 结束日期1/2       endDate
 * 学校名称1/2       school
 * 学历1/2          education
 * 学历获取方式1/2    eduSource
 * 学校所在地1/2     schoolAddr
 *
 ** 工作经历
 * 开始日期1234      startDate
 * 结束日期1234      endDate
 * 工作单位1234      workUnit
 * 岗位1234         post
 * 离职原因1234      leaving
 * 证明人电话1234    witPhone
 *
 ** 培训经历
 * 培训时间1234     trainDate
 * 培训机构1234     trainPlace
 * 培训内容1234     trainCon
 *
 ** 资格证书
 * 颁发时间1234     trainDate
 * 证书名称1234     trainPlace
 * 颁发机构1234     trainCon
 *
 ** 家庭成员情况
 * 关系12          relation
 * 姓名12          name
 * 联系方式12       phone
 * 工作单位12       workUnit
 *
 *
 *
 */
