package com.ujiuye.service.impl;

import com.ujiuye.dao.StudentDao;
import com.ujiuye.dao.impl.StudentDaoImpl;
import com.ujiuye.entity.Student;
import com.ujiuye.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    StudentDao sd = new StudentDaoImpl();
    @Override
    public List<Student> getAllStudent() {
        List<Student> list = sd.getAllStudent();
        return list;
    }
}
