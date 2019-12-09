package com.yhtos.talent.myservlet;

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
 * 功能：注册用户异步检查
 */
@WebServlet("/RegUAInsServlet")
public class RegUAInsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html,charset=utf-8");

        String data = request.getParameter("data");
        JSONObject jsonObject = new JSONObject(data);
        String userName = jsonObject.getString("username");

        int statu = 0;//1：没有用户，可以注册     0：用户名重复
        if (DAOFactory.getLoginDAOImpl().selectLogin(userName,"") == null){
            statu = 1;
        }

        JSONObject resJson = new JSONObject();
        resJson.put("username",userName);
        resJson.put("statu",statu);

        response.getWriter().print(resJson.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
