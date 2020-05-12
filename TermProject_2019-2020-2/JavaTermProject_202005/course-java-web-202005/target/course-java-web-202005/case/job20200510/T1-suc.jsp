<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/9
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
String userAcc=request.getParameter("userAcc");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=userAcc%>，恭喜您注册成功
</body>
</html>
