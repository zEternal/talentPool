package com.yhtos.talent.myservlet;

import com.yhtos.talent.dao.impl.OperatorDAOImpl;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 功能：删除操作员
 */
@WebServlet(name = "DeleteOperatorServlet", urlPatterns = "/DeleteOperatorServlet")
public class DeleteOperatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html,charset=utf-8");
        int statusCode = 4;

        String username = request.getParameter("username");
        String[] idS = request.getParameter("id").split(",");
        List<String> list = Arrays.asList(idS);

        int n = new OperatorDAOImpl().removeMany(list);
        if (n > 0) {
            statusCode = 10;
        }
        /*int[] ids = new int[idS.length];
        for (int i = 0; i < idS.length; i ++) {
            ids[i] = Integer.parseInt(idS[i]);
        }
*/


        JSONObject resJson = new JSONObject();
        resJson.put("username",request.getSession().getAttribute("username"));
        resJson.put("statu",statusCode);
        response.getWriter().print(resJson.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
