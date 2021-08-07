<%@ page import="com.kevinkda.univ.course.web.test20200508.service.ToolUtils" %><%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/8
  Time: 08:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
//    request.setCharacterEncoding("utf-8");
    String userAcc = request.getParameter("userAcc");
    String userPass = request.getParameter("userPass");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=userAcc%>
<br>
<%=userPass%>
</body>
</html>
