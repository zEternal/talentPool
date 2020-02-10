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
        return 0;
    }

    @Override
    public int removeMany(List<String> list) {
        return 0;
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

        return null;
    }

    public List<OperatorT> findOpertorByName(String name)  {
        List<OperatorT> operator = null;

        String sql = "SELECT *,password FROM tb_operator,tb_user WHERE name='"+ name +"' and tb_operator.username=tb_user.username";
        try {
            operator = DBUtil.getModelsWithSqlAndParams(sql,null,new OperatorT());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return operator;
    }

    @Override
    public List<OperatorT> findAll() {
        return null;
    }
}
