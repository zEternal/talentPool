package com.yhtos.talent.dao.impl;

import com.yhtos.talent.bean.LoginT;
import com.yhtos.talent.dao.LoginDAO;
import com.yhtos.talent.dao.factory.DAOFactory;
import com.yhtos.talent.util.DBUtil;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoginDAOImpl implements LoginDAO {

    /**
     * 功能：将注册信息插入数据库
     * @param loginT 数据表映射对象
     * @return 1：插入成功
     */
    @Override
    public int addLogin(LoginT loginT) {
        int statusCode = 0;//状态码

        String sql = "insert into tb_user (username,pw,role) " +
                "value('"+loginT.getUsername()+"','"+loginT.getPassword()+"','"+loginT.getRole() +"')";
        int n = DBUtil.change(sql);
        if(n > 0){
            statusCode = 1;
        }
        return statusCode;
    }

    @Override
    public int updateLogin(LoginT loginT) {
        return 0;
    }

    @Override
    public int deleteLogin(String userName) {
        return 0;
    }

    @Override
    public LoginT selectLogin(String userName, String password) {

        List<LoginT> list = new ArrayList<>();
        list = DAOFactory.getLoginDAOImpl().selectLoginMany(userName, password);
        LoginT loginT = null;
        if(list.size() > 0) {
            loginT = list.get(0);
        }

        System.out.println("+++++++++");
        return loginT;
    }

    @Override
    public List<LoginT> selectLoginMany(String userName, String password) {
        List<LoginT> list = new ArrayList<>();

        StringBuilder sqlBuilder = new StringBuilder("select * from tb_user where 1=1 ");
        if(! userName.equals("")){
            sqlBuilder.append("and username='"+ userName +"' ");
        }
        if(! password.equals("")){
            sqlBuilder.append("and password='"+ password +"'");
        }
        DBUtil dbUtil = new DBUtil();

        ArrayList<Map<String, Object>> listDB = null;
        try {
            listDB = dbUtil.quary(sqlBuilder.toString());
        } catch (Exception e) {
            System.out.println("查询错误");
            e.printStackTrace();
        }
        for (int i = 0; i < listDB.size(); i ++) {
            LoginT loginT = new LoginT();

            try {
                loginT.setId(Integer.parseInt(listDB.get(i).get("id").toString()));
                loginT.setUsername(listDB.get(i).get("username").toString());
                loginT.setPassword(listDB.get(i).get("password").toString());
                loginT.setRole(Integer.parseInt(listDB.get(i).get("role").toString()));
                loginT.setSlamp((Date) listDB.get(i).get("slamp"));
            } catch (NumberFormatException e) {
                System.out.println("数据类型转换错误");
                e.printStackTrace();
            }

            list.add(loginT);
        }
        return list;
    }
}
