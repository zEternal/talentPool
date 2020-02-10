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


        OperatorDAOImpl op = new OperatorDAOImpl();
        List<OperatorT> lsit = op.findOpertorByName("sdf");
        String sd = JSONSerializer.toJSON(lsit).toString();
        System.out.println(sd);
        System.out.println(lsit.get(0).getUsername());
        System.out.println(lsit.get(0).getName());
    }

    public static void show(String userName, String pw,int i){
        List<LoginT> list = new ArrayList<>();
        LoginT loginT = list.get(0);
    }
}
