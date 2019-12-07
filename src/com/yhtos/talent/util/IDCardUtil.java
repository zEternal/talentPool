package com.yhtos.talent.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 类名：IDCardUtil
 * 功能：身份证信息提取
 * 创建人：star
 * 创建时间：2019/12/2
 * 修改时间：
 */
public class IDCardUtil {
    /**
     * 提取出生日期
     * @param idStr 身份证号
     * @return util.Date 出生日期
     */
    public static Date dateOfBirth(String idStr) {
        Date date = new Date();
        String iDCardNo = "";

        if (idStr.length() == 18) {
            iDCardNo = idStr.substring(0, 17);
        } else if (idStr.length() == 15) {
            iDCardNo = idStr.substring(0, 6) + "19" + idStr.substring(6, 15);
        }
        String strYear = iDCardNo.substring(6, 10);// 年份
        String strMonth = iDCardNo.substring(10, 12);// 月份
        String strDay = iDCardNo.substring(12, 14);// 月份

        String strDate = strYear + "-" + strMonth + "-" + strDay;
        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = sDateFormat.parse(strDate);
        } catch (ParseException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }

        return date;
    }

    /**
     * 功能：返回身份证性别奇偶数
     * @param idStr 身份证号
     * @return 0/1
     */
    public static int getSex(String idStr){
        int sex;
        if(idStr.length() == 18){
            sex = (Integer.parseInt(String.valueOf(idStr.charAt(16)))&1);

        } else {
            sex = (Integer.parseInt(String.valueOf(idStr.charAt(14)))&1);
        }

        return  sex;
    }
}
