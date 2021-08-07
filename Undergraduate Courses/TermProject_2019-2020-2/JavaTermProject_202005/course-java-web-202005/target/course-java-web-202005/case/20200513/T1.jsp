<%@ page import="com.kevinkda.univ.course.web.test20200513.domain.Student" %><%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/13
  Time: 08:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    Student stu = (Student) request.getAttribute("stu");
    request.setAttribute("stu", stu);
    session.setAttribute("stuA", stu);
    Student[] stus = (Student[]) request.getAttribute("stus");
    request.setAttribute("stus", stus);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <p>${requestScope.stu.id}</p>
    <p>${requestScope.stu.name}</p>
    <br>
    <p>Arrays</p>
    <br>
    <p>${requestScope.stus[0].id}</p>
    <p>${requestScope.stus[0].name}</p>
    <p>${requestScope.stus[1].id}</p>
    <p>${requestScope.stus[2].name}</p>

    <br>

    <p>${sessionScope.stuA.name}</p>

    <br>

    <p>3 eq 4 : ${3 eq 4}</p>
    <%--    <p><%=stu.getId()%></p>--%>
    <%--    <p><%=stu.getName()%></p>--%>
</div>
</body>
</html>
