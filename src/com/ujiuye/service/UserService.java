package com.ujiuye.service;

public interface UserService {
    boolean login(String username,String pwd);
    boolean regist(String username,String pwd);
}
