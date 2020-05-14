<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/13
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
        request.setAttribute("userAcc", request.getParameter("userAcc"));
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <p>${userAcc}</p>
</div>
</body>
</html>
