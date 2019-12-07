package com.yhtos.talent.testMain;

import com.yhtos.talent.bean.LoginT;
import com.yhtos.talent.dao.LoginDAO;
import com.yhtos.talent.dao.factory.DAOFactory;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {

        DAOFactory.getLoginDAOImpl().selectLogin("","");

    }

    public static void show(String userName, String pw,int i){
        List<LoginT> list = new ArrayList<>();
        LoginT loginT = list.get(0);
    }
}
