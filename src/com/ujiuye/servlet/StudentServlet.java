package com.ujiuye.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ujiuye.entity.Student;
import com.ujiuye.service.StudentService;
import com.ujiuye.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/StudentServlet")
public class StudentServlet extends BaseServlet {
    StudentService ss = new StudentServiceImpl();
    protected void getAllStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> list = ss.getAllStudent();
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(list);
        PrintWriter out = response.getWriter();
        out.print(json);
        out.close();
//        request.setAttribute("stuList",list);
//        request.getRequestDispatcher("Allstudent.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
