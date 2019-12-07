package com.yhtos.talent.dao.factory;

import com.yhtos.talent.dao.impl.LoginDAOImpl;

public class DAOFactory {
    public static LoginDAOImpl getLoginDAOImpl(){
        return new LoginDAOImpl();
    }
}
