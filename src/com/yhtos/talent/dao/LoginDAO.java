package com.yhtos.talent.dao;

import com.yhtos.talent.bean.LoginT;

import java.util.List;

/**
 * 类名：LoginDAO
 * 功能：登录表功能实现接口
 * 创建人：star
 * 创建时间：2019/12/5
 */
public interface LoginDAO {

    /**
     * 插入
     * @param loginT
     * @return
     */
    int addLogin(LoginT loginT);

    /**
     * 修改
     * @param loginT
     * @return
     */
    int updateLogin(LoginT loginT);

    /**
     * 删除一个
     * @param userName
     * @return
     */
    int deleteLogin(String userName);

    /**
     * 查询
     * @param userName
     * @return
     */
    LoginT selectLogin(String userName, String password);

    /**
     * 查询多条数据
     * @param userName
     * @param password
     * @return
     */
    List<LoginT> selectLoginMany(String userName, String password);
}
