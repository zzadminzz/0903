package com.ujiuye.service.impl;

import com.ujiuye.dao.UserDao;
import com.ujiuye.dao.impl.UserDaoImpl;
import com.ujiuye.entity.User;
import com.ujiuye.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao ud = new UserDaoImpl();
    @Override
    public boolean login(String username, String pwd) {
        User user = ud.login(username,pwd);
        boolean res = true;
        if (user == null){
            res = false;
        }
        return res;
    }

    @Override
    public boolean regist(String username, String pwd) {
        int rows = 0;
        rows = ud.regist(username, pwd);
        if (rows == 0){
            return false;
        }
        return true;
    }
}
