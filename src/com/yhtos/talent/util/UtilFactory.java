package com.yhtos.talent.util;


/**
 * 类名：
 * 功能：工具工厂类
 * 创建人：star-cc
 * 创建时间：2020/1/3
 *
 */
public class UtilFactory {
    public DBUtil getDb(){
        return new DBUtil();
    }
}
