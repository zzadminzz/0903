package com.ujiuye.dao.impl;

import com.ujiuye.dao.UserDao;
import com.ujiuye.entity.User;
import com.ujiuye.util.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;
public class UserDaoImpl implements UserDao {
    QueryRunner qr = JdbcUtil.getQueryRunner();
    @Override
    public User login(String username,String pwd) {
        User user = null;
        String sql = "select * from tb_user where username=? and pwd=?";
        try {
            user = qr.query(sql,new BeanHandler<>(User.class),username,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public int regist(String username, String pwd) {
        int rows = 0;
        String sql = "insert into tb_user(username,pwd) values(?,?)";
        try {
            rows = qr.update(sql,username,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }
}
