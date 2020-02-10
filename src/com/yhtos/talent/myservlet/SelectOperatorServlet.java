package com.yhtos.talent.myservlet;

import com.yhtos.talent.bean.OperatorT;
import com.yhtos.talent.dao.impl.OperatorDAOImpl;
import net.sf.json.JSONSerializer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 功能：查询管理员
 */
@WebServlet(name = "SelectOperatorServlet", urlPatterns = "/SelectOperatorServlet")
public class SelectOperatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html,charset=utf-8");
        String username = request.getParameter("username");
        String name = request.getParameter("name");

        List<OperatorT> list = new OperatorDAOImpl().findOpertorByName(name);

        String resJson = JSONSerializer.toJSON(list).toString();

        response.getWriter().print(resJson);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
