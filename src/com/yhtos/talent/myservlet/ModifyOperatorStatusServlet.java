package com.yhtos.talent.myservlet;

import com.yhtos.talent.dao.impl.OperatorDAOImpl;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ModifyOperatorStatusServlet", urlPatterns = "/ModifyOperatorStatusServlet")
public class ModifyOperatorStatusServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html,charset=utf-8");
        int statusCode = 4;
        String username = request.getParameter("username");
        String status = request.getParameter("status");
        int state = Integer.parseInt(status);
        if (state == 0 || state == 1) {
            int n = new OperatorDAOImpl().updateStatus(username,state);
            if (n > 0) {
                statusCode = 10;
            }
        }
        JSONObject resJson = new JSONObject();
        resJson.put("username",request.getSession().getAttribute("username"));
        resJson.put("statu",statusCode);

        response.getWriter().print(resJson.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
