package com.yhtos.talent.testMain;

import com.yhtos.talent.bean.LoginT;
import com.yhtos.talent.bean.OperatorT;
import com.yhtos.talent.bean.UsersInfoT;
import com.yhtos.talent.dao.LoginDAO;
import com.yhtos.talent.dao.factory.DAOFactory;
import com.yhtos.talent.dao.impl.OperatorDAOImpl;
import com.yhtos.talent.dao.impl.UsersInfoDAOImpl;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {

        JSONObject jsonObject = JSONObject.fromObject(new OperatorDAOImpl().findByUsername("1"));
        String resJson = jsonObject.toString();
        System.out.println(resJson);
    }

    public static void show(String userName, String pw,int i){
        List<LoginT> list = new ArrayList<>();
        LoginT loginT = list.get(0);
    }
}
