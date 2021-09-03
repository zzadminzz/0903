<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>学生信息显示</title>
    <script src="js/axios.min.js"></script>
    <script src="js/vue.js"></script>
<%--    <style type="text/css">--%>
<%--        .top{--%>
<%--            text-align: center;--%>
<%--            font-weight: bold;--%>
<%--        }--%>
<%--    </style>--%>
</head>
<body>
<div id="app">
    <table>
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>邮箱</th>
        </tr>
        <tr v-for="stu in students">
            <td>{{stu.sid}}</td>
            <td>{{stu.sname}}</td>
            <td>{{stu.sage}}</td>
            <td>{{stu.ssex}}</td>
            <td>{{stu.semail}}</td>
        </tr>
    </table>
</div>
<script type="text/javascript">
    new Vue({
        el:"#app",
        data:{
            students:""
        },
        created:function(){
            //请求后端服务器返回学生信息
            axios({
                method:"get",
                url:"http://localhost:8080/Demo02_war_exploded/studentServlet"
            }).then(obj => {
                this.students = obj.data;
            });
        }
    });
</script>

</body>
</html>

<%--<div class="top"><h1>学生信息管理系统</h1></div>--%>
<%--<hr style="border-color:slategray">--%>
<%--<br><br>--%>
<%--&lt;%&ndash;<form method="post" action="StudentServlet">&ndash;%&gt;--%>
<%--&lt;%&ndash;    <input type="hidden" name="flag" value="getAllStudent">&ndash;%&gt;--%>
<%--&lt;%&ndash;</form>&ndash;%&gt;--%>
<%--<table border="1" cellspacing="0" cellpadding="0" align="center" width="500">--%>
<%--    <tr>--%>
<%--        <th>学号</th>--%>
<%--        <th>姓名</th>--%>
<%--        <th>性别</th>--%>
<%--        <th>年龄</th>--%>
<%--        <th>邮箱</th>--%>
<%--    </tr>--%>
<%--    &lt;%&ndash;<%--%>
<%--        List<Student> list = (List<Student>)request.getAttribute("stuList");--%>
<%--        for (Student stu:list){--%>
<%--    %>--%>
<%--        <tr align="center">--%>
<%--            <td><%=stu.getSid()%></td>--%>
<%--            <td><%=stu.getSname()%></td>--%>
<%--            <td><%=stu.getSex()%></td>--%>
<%--            <td><%=stu.getAge()%></td>--%>
<%--            <td><%=stu.getEmail()%></td>--%>
<%--        </tr>--%>
<%--    <%--%>
<%--        }--%>
<%--    %>&ndash;%&gt;--%>
<%--    <c:forEach var="stu" items="${stuList}">--%>
<%--        <tr align="center">--%>
<%--            <td>${stu.sid}</td>--%>
<%--            <td>${stu.sname}</td>--%>
<%--            <td>${stu.ssex}</td>--%>
<%--            <td>${stu.sage}</td>--%>
<%--            <td>${stu.semail}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>