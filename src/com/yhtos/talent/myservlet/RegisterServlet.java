package com.yhtos.talent.myservlet;

import com.yhtos.talent.bean.LoginT;
import com.yhtos.talent.dao.LoginDAO;
import com.yhtos.talent.dao.factory.DAOFactory;
import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * 功能：注册
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html,charset=utf-8");

        System.out.println("进入注册servlet");
        /*******简易接收*******/
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        /***************/

        /******json接收********/
        /*String data = request.getParameter("data");
        String userName = null;
        String password = null;
        try {
            JSONObject jsonObject = new JSONObject(data);
            userName = jsonObject.getString("username");
            password = jsonObject.getString("password");
            System.out.println("json 解析完毕");
        } catch (JSONException e) {
            System.out.println("json 解析异常");
            e.printStackTrace();
        }*/
        /****************************************/
        int role = 1;//1 普通用户  2 操作员  3 超级管理员
        int statu = 0;  //1 注册成功      0 注册失败
        LoginT loginT = new LoginT(userName,password,role);

        if (DAOFactory.getLoginDAOImpl().addLogin(loginT) > 0) {
            statu = 1;
        }

        JSONObject resJson = new JSONObject();
        resJson.put("username",userName);
        resJson.put("statu",statu);

        response.getWriter().print(resJson.toString());
        System.out.println("返回响应");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
