package com.yhtos.talent.dao.impl;

import com.yhtos.talent.bean.OperatorT;
import com.yhtos.talent.dao.UserDAO;
import com.yhtos.talent.util.DBUtil;
import com.yhtos.talent.util.SkyTimeUtil;

import java.util.ArrayList;
import java.util.List;

public class OperatorDAOImpl implements UserDAO<OperatorT> {

    @Override
    public int save(OperatorT operatorT) {
        int statusCode = 0;//状态码
        String sql = "insert into tb_operator values(null,?,?,?,?,?,?)";
        List<Object> params=new ArrayList<Object>();
        params.add(operatorT.getUsername());
        params.add(operatorT.getName());
        params.add(operatorT.getPhone());
        params.add(operatorT.getStatus());
        params.add(operatorT.getRegion());
        params.add(SkyTimeUtil.returnNowTime());

        try {
            statusCode = DBUtil.executeUpdate(sql,params);
        } catch (Exception e) {
            System.out.println("数据插入异常！！！");
            e.printStackTrace();
        }
        return statusCode;
    }

    @Override
    public int remove(String username) {
        int statusCode = 0;//状态码

        String sql = "DELETE FROM tb_operator WHERE id =  ";
        return 0;
    }

    @Override
    public int removeMany(List<String> list) {
        int statusCode = 0;//状态码
        StringBuffer sql = new StringBuffer().append("DELETE FROM tb_operator WHERE 1=1 ");
        List<Object> params=new ArrayList<Object>();
        for (String id : list) {
            sql.append("or id=? ");
            params.add(Integer.parseInt(id));
        }

        statusCode = DBUtil.executeUpdate(sql.toString(),params);

        return statusCode;
    }

    /**
     * 功能：修改操作员状态
     * @param username
     * @param status 0：停用      1：启用
     * @return
     */
    public int updateStatus(String username, int status) {
        int statusCode = 0;

        String sql = "UPDATE tb_operator SET status=? WHERE username=?";
        List<Object> params=new ArrayList<Object>();
        params.add(username);
        params.add(status);
        statusCode = DBUtil.executeUpdate(sql,params);

        return statusCode;
    }

    @Override
    public int update(OperatorT operatorT) {
        int statusCode = 0;

        String sql = "UPDATE tb_operator SET name=?,phone=?,region=? WHERE username=?";
        List<Object> params=new ArrayList<Object>();
        params.add(operatorT.getName());
        params.add(operatorT.getPhone());
        params.add(operatorT.getRegion());
        params.add(operatorT.getUsername());
        statusCode = DBUtil.executeUpdate(sql,params);

        return statusCode;
    }

    @Override
    public OperatorT findByUsername(String username) {
        int id = Integer.parseInt(username);
        List<OperatorT> operator = null;
        String sql = "SELECT *,password FROM tb_operator,tb_user WHERE tb_operator.id='"+ id +"' and tb_operator.username=tb_user.username";

        try {
            operator = DBUtil.getModelsWithSqlAndParams(sql,null,new OperatorT());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return operator.get(0);
    }

    public List<OperatorT> findOpertorByName(String name)  {
        List<OperatorT> operator = null;

        String sql = "SELECT *,password FROM tb_operator,tb_user WHERE name='"+ name +"' and tb_operator.username=tb_user.username";
        if (name == null || name.equals("")){
            sql = "SELECT *,password FROM tb_operator,tb_user WHERE tb_operator.username=tb_user.username";
        }
        try {
            operator = DBUtil.getModelsWithSqlAndParams(sql,null,new OperatorT());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return operator;
    }

    @Override
    public List<OperatorT> findAll() {

        List<OperatorT> operator = null;

        String sql = "SELECT *,password FROM tb_operator,tb_user WHERE tb_operator.username=tb_user.username";
        try {
            operator = DBUtil.getModelsWithSqlAndParams(sql,null,new OperatorT());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return operator;
    }
}
