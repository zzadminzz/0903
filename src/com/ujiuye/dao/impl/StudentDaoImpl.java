package com.ujiuye.dao.impl;

import com.ujiuye.dao.StudentDao;
import com.ujiuye.entity.Student;
import com.ujiuye.util.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    QueryRunner qr = JdbcUtil.getQueryRunner();
    @Override
    public List<Student> getAllStudent() {
        List<Student> list =null;
        String sql = "select * from student";
        try {
            list = qr.query(sql,new BeanListHandler<>(Student.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
