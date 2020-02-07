package com.yhtos.talent.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SkyTimeUtil {

    /**
     * 返回当前时间的字符串形式
     * @return
     */
    public static String returnNowTime(){
        Date date=new Date();   //这里的时util包下的
        SimpleDateFormat temp=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //这是24时
        return temp.format(date);
    }


}
