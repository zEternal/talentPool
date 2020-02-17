package com.yhtos.talent.myservlet;

import com.yhtos.talent.dao.impl.OperatorDAOImpl;
import com.yhtos.talent.dao.impl.UsersInfoDAOImpl;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

        @WebServlet(name = "SelectOperatorUserServlet", urlPatterns = "/SelectOperatorUserServlet")
public class SelectOperatorUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String roles = request.getParameter("roles");
        String username = request.getParameter("username");
        String resJson = "";
        if (roles.equals("operator")) {
            resJson = JSONObject.fromObject(new OperatorDAOImpl().findByUsername(username)).toString();
        }
        if (roles.equals("user")) {
            resJson = JSONObject.fromObject(new UsersInfoDAOImpl().findUserById(Integer.parseInt(username))).toString();
        }
        response.getWriter().print(resJson);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }
}
