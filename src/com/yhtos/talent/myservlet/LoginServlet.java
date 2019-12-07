package com.yhtos.talent.myservlet;

import com.yhtos.talent.dao.LoginDAO;
import com.yhtos.talent.dao.factory.DAOFactory;
import com.yhtos.talent.dao.impl.LoginDAOImpl;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html,charset=utf-8");

        String data = request.getParameter("data");
        JSONObject jsonObject = new JSONObject(data);
        String userName = jsonObject.getString("username");
        String password = jsonObject.getString("password");

        LoginDAO loginDAO = DAOFactory.getLoginDAOImpl();
        int statu = 0;//1：登录成功   2：用户名不存在
        //用户名
        if (loginDAO.selectLogin(userName,"") == null){
            statu = 2;
        }
        //登录成功
        if (loginDAO.selectLogin(userName,password) != null){
            statu = 1;
        }
        JSONObject resJson = new JSONObject();
        resJson.put("username",userName);
        resJson.put("statu",statu);

        response.getWriter().print(resJson.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
