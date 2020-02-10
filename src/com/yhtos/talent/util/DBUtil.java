package com.yhtos.talent.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
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

    static String url = "jdbc:mysql://www.tyrj.xyz:3306/factory?serverTimezone=CTT&useUnicode=true&characterEncoding=UTF-8";
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
                System.out.println("填充："+params.get(i));
            }
            try {
                result = pstmt.executeUpdate();
                System.out.println("执行完毕sql");
            } catch (SQLException e) {
                System.out.println("执行sql异常");
                e.printStackTrace();
            }

            DBUtil.closeJDBC(null, pstmt, conn);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
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


    /**
     * @throws Exception
     *
     * @Title: getModelsWithSqlAndParams
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param sql
     * @param param
     *            设定文件
     * @return void 返回类型
     * @throws
     */
    public static <T> List<T> getModelsWithSqlAndParams(String sql,
                                                        List<Object> param, T t) throws Exception {

        // 定义一个集合用来存放查询出来的结果集
        List<T> list = new ArrayList<T>();

        Class<?> C = t.getClass();

        // 执行查询获取结果集
        ResultSet rs = exequery(sql, param);

        while (rs.next()) {
            // 通过反射出来的类来实力话一个对象
            //T obj =(T) C.newInstance();
            T obj =(T) C.getDeclaredConstructor().newInstance();
            // 取出来当前对象里的每个属性对应的值
            //C = C.getSuperclass();

            for (; C != Object.class ; C = C.getSuperclass()) {
                Field[] fields = C.getDeclaredFields();
                for (Field f : fields) {
                    //f.setAccessible(true);
                    String fname = f.getName();
                    String ftype = f.getType().getSimpleName();
                    Object value = null;

                    //判断当前列是否存在，存在的话，再进行下一步
                    if (!columExist(fname, rs)) continue;

                    if (ftype.toLowerCase().equals("string")) {
                        value = rs.getString(fname);
                    } else if (ftype.toLowerCase().equals("int")) {
                        value = rs.getInt(fname);
                    } else if (ftype.toLowerCase().equals("double")) {
                        value = rs.getDouble(fname);
                    } else if (ftype.toLowerCase().equals("long")) {
                        value = rs.getLong(fname);
                    } else if (ftype.toLowerCase().equals("float")) {
                        value = rs.getFloat(fname);
                    }

                    // 将去到的值付给obj
                    //Method[] methods = C.getDeclaredMethods();
                    Method[] methods = C.getMethods();
                    for (Method m : methods) {
                        String mname = m.getName().toLowerCase();
                        if (mname.equals("set" + fname.toLowerCase())) {
                            // 执行该 方法
                            m.invoke(obj, value);
                        }
                    }
                }
            }
            list.add(obj);
        }
        return list;
    }

    /**
     *
     * @Title: exequery
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param sql
     * @param param
     * @return 设定文件
     * @return ResultSet 返回类型
     * @throws
     */
    public static ResultSet exequery(String sql, List<Object> param) {
        // 获取连接
        conn = DBUtil.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(sql);
            // 封装参数
            if (param != null)
                for (int i = 0; i < param.size(); i++) {
                    pstmt.setObject(i + 1, param.get(i));
                }
            // 执行sql
            rs = pstmt.executeQuery();

            return rs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 判断列是否存在
     */
    public static boolean columExist(String columName,ResultSet rs){

        boolean flag=false;

        try{
            if(rs.findColumn(columName)>0){
                flag=true;
            }
        }catch(Exception e){
            flag=false;
        }
        return flag;
    }

}
