<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/19
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    if (session.getAttribute("loginAcc") == null) {
        response.sendRedirect("T1-login.jsp");
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <p>Exit Success</p>
</div>
</body>
</html>
