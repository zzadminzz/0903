package com.ujiuye.dao;

import com.ujiuye.entity.User;

public interface UserDao {
    public User login(String username,String pwd);
    public int regist(String username,String pwd);
}
