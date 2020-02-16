package com.yhtos.talent.testMain;

import com.yhtos.talent.bean.LoginT;
import com.yhtos.talent.bean.OperatorT;
import com.yhtos.talent.dao.LoginDAO;
import com.yhtos.talent.dao.factory.DAOFactory;
import com.yhtos.talent.dao.impl.OperatorDAOImpl;
import net.sf.json.JSONSerializer;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {


        String strs = "1,2,6,7,9,";
        String[] ids = strs.split(",");
        for(int i = 0; i < ids.length; i ++){
            System.out.println(ids[i]);
        }
    }

    public static void show(String userName, String pw,int i){
        List<LoginT> list = new ArrayList<>();
        LoginT loginT = list.get(0);
    }
}
