package com.yhtos.talent.util;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类名：DBUtil
 * 功能：数据库操作类
 * 创建人：star
 * 创建时间：2019/12/2
 * 修改时间：
 */

public class DBUtil {

    static String url = "jdbc:mysql://www.tyrj.xyz:3306/factory?serverTimezone=CTT";
    static String username = "factoryadmin";
    static String password = "factoryroot";

    private static Connection conn = null;
    private static PreparedStatement pstmt = null;
    private static ResultSet rSet = null;
    /**
     * 驱动加载
     */
    static {
        try {//安装MySQL驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     * 数据库连接
     * @return
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {//连接数据库
            System.out.println("连接数据库开始");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("连接数据库成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    /**
     * 功能：关闭数据库
     * @param rs  	ResultSet
     * @param stmt	Statement
     * @param conn	Connection
     */
    public static void closeJDBC(ResultSet rs,Statement stmt, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("关闭数据库成功");
    }

    /**
     * 功能：数据库增删改
     * @param sql  sql语句
     * @return 改变行数
     */
    public static int change(String sql) {
        int i = 0;

        conn = DBUtil.getConnection();
        pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            i = pstmt.executeUpdate();
            System.out.println("执行完毕sql");
            DBUtil.closeJDBC(null, pstmt, conn);
        } catch (Exception e) {
            // TODO: handle exception
        }

        return i;
    }

    public static int executeUpdate(String sql, List<Object> params) {
        int result = 0;

        conn = DBUtil.getConnection();
        pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < params.size(); i++) {
                pstmt.setObject(i + 1, params.get(i));
            }
            result = pstmt.executeUpdate();
            System.out.println("执行完毕sql");
            DBUtil.closeJDBC(null, pstmt, conn);
        } catch (Exception e) {
            // TODO: handle exception
        }

        return result;
    }



    /**
     * 功能：查询
     * @param sql sql语句
     * @return  返回结果集 ，list-map表
     */
    public ArrayList<Map<String, Object>> quary(String sql){
        ArrayList<Map<String, Object>> list = new ArrayList<>();
        try {
            Connection conn = DBUtil.getConnection();
            //sql = "SELECT * FROM info";
            pstmt = conn.prepareStatement(sql);
            System.out.println("即将获取结果集");
            rSet = pstmt.executeQuery();
            System.out.println("获取结果集");
            //表结构
            ResultSetMetaData resultSetMetaData = rSet.getMetaData();
            while(rSet.next()) {
                Map<String, Object> map = new HashMap<String, Object>();
                //获得列数
                int col = resultSetMetaData.getColumnCount();
                for(int i = 1; i <= col; i ++) {
                    String key = resultSetMetaData.getColumnName(i);
                    Object v = rSet.getObject(i);
                    map.put(key, v);
                }
                list.add(map);
            }

            DBUtil.closeJDBC(rSet, pstmt, conn);
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return list;
    }
}
