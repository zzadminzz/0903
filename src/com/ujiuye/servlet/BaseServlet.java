package com.ujiuye.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String flag = request.getParameter("flag");
        //获取当前类的字节码对象
        Class c = this.getClass();
        try {
            Method m = c.getDeclaredMethod(flag, HttpServletRequest.class, HttpServletResponse.class);
//            打破方法的修饰符限制
            m.setAccessible(true);
            m.invoke(this,request,response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
