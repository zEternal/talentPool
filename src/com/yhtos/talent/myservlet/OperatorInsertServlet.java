package com.yhtos.talent.myservlet;

import com.yhtos.talent.bean.LoginT;
import com.yhtos.talent.bean.OperatorT;
import com.yhtos.talent.dao.factory.DAOFactory;
import com.yhtos.talent.dao.impl.OperatorDAOImpl;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 功能：插入、修改操作员
 */
@WebServlet(name = "OperatorInsertServlet", urlPatterns = "/OperatorInsertServlet")
public class OperatorInsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html,charset=utf-8");
        String username = request.getParameter("username");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        //表单性质nature，“1”：插入    “2”：修改
        String nature = request.getParameter("nature");
        String region = request.getParameter("region");
        OperatorT operator = new OperatorT(username,name,phone,1,region);
        int statusCode = 4;
        JSONObject resJson = new JSONObject();
        /*   插入操作员  */
        if (nature.equals("1")){
            //添加用户名密码
            LoginT loginT = new LoginT(username,password,2);
            int statusUser = DAOFactory.getLoginDAOImpl().addLogin(loginT);
            //添加基本信息
            OperatorDAOImpl operatorDAO = new OperatorDAOImpl();
            int n = operatorDAO.save(operator);
            if (n > 0 && statusUser > 0) {
                statusCode = 10;
            }
        } else {
            /*   修改操作员信息  */
            if (nature.equals("2")) {
                //修改用户名密码
                int statusUser =  DAOFactory.getLoginDAOImpl().updateLogin(new LoginT(username,password,2));
                //修改基本信息
                OperatorDAOImpl operatorDAO = new OperatorDAOImpl();
                int n = operatorDAO.update(operator);

                if (statusUser > 0 && n > 0)  {
                    statusCode = 10;
                }
            }
        }
        resJson.put("username",username);
        resJson.put("statu",statusCode);
        response.getWriter().print(resJson.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
