package com.ujiuye.servlet;

import com.ujiuye.service.UserService;
import com.ujiuye.service.impl.UserServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserServlet")
public class UserServlet extends BaseServlet {
    UserService us = new UserServiceImpl();
    protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("username");
    String pwd = request.getParameter("pwd");
        boolean res = us.login(username, pwd);
        if (res){
//            登录成功
            response.sendRedirect("index.jsp");
        }else {
//            登陆失败
            response.sendRedirect("login.html");
        }
    }

    protected void regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        boolean res = us.regist(username, pwd);
        if (res){
//            注册成功
            response.sendRedirect("login.html");
        }else {
//            注册失败
            response.sendRedirect("regist.html");
        }
    }
}
