package com.yhtos.talent.dao;

import java.util.List;

public interface UserDAO<T> {
    /**
     * 将实体对象持久化（存数据库）
     * @param t 需要持久化操作的对象
     * @return 数据库影响的行数
     */
    int save(T t);

    /**
     * 按用户名删除数据库中的对象
     * @param username 需要删除元组的用户名
     * @return 数据库影响的行数
     */
    int remove(String username);

    /**
     * 删除集合中元组
     * @param list 要删除元组的用户名集合
     * @return 数据库影响的行数
     */
    int removeMany(List<String> list);

    /**
     * 修改一个元组
     * @param t 要修改的元组对象
     * @return 数据库影响的行数
     */
    int update(T t);

    /**
     * 按用户名来查找某一个用户信息
     * @param username 需要查询信息的用户名
     * @return 数据实体对象
     */
    T findByUsername(String username);

    /**
     * 查询数据库中所有数据
     * @return 返回实体属性集合
     */
    List<T> findAll();



    /**
     *
     * @return
     */
    //List<T>  findMany();
}
