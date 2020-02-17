package com.yhtos.talent.myservlet;

import com.yhtos.talent.dao.impl.UsersInfoDAOImpl;
import net.sf.json.JSONSerializer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SelectUserServlet", urlPatterns = "/SelectUserServlet")
public class SelectUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //String username = request.getParameter("username");
        //int state = Integer.parseInt(request.getParameter("state"));

        List list = new UsersInfoDAOImpl().findUsers(2);
        String resJson = JSONSerializer.toJSON(list).toString();

        response.getWriter().print(resJson);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
