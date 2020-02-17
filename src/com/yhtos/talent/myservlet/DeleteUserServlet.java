package com.yhtos.talent.myservlet;

import com.yhtos.talent.dao.impl.UsersInfoDAOImpl;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "DeleteUserServlet", urlPatterns = "/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int statusCode = 4;

        String username = request.getParameter("username");
        String[] idS = request.getParameter("id").split(",");
        List<String> list = Arrays.asList(idS);

        int n = new UsersInfoDAOImpl().removeMany(list);
        if (n > 0) {
            statusCode = 10;
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
