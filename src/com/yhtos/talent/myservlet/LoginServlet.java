package com.yhtos.talent.myservlet;

import com.yhtos.talent.bean.LoginT;
import com.yhtos.talent.dao.LoginDAO;
import com.yhtos.talent.dao.factory.DAOFactory;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用户登录功能处理
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html,charset=utf-8");

        /********************简易接收*******************/
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        /***************************/

        /******************json接收*******************/
        /*String data = request.getParameter("data");
        JSONObject jsonObject = new JSONObject(data);
        String userName = jsonObject.getString("username");
        String password = jsonObject.getString("password");*/
        /******************************************/

        LoginDAO loginDAO = DAOFactory.getLoginDAOImpl();
        int statu = 0;//1：登录成功   2：用户名不存在
        int role = 0;   //0: 角色获取异常  1 普通用户  2 操作员  3 超级管理员
        //用户名
        if (loginDAO.selectLogin(userName,"") == null){
            statu = 2;
        }


        LoginT loginT = null;

        loginT = loginDAO.selectLogin(userName,password);
        //登录成功
        if (loginT != null){
            statu = 1;
            role = loginT.getRole();
        }

        JSONObject resJson = new JSONObject();
        resJson.put("username",userName);
        resJson.put("statu",statu);
        resJson.put("role", role);

        response.getWriter().print(resJson.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }


}
