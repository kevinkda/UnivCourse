<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/12
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String userAcc = (String) session.getAttribute("userAcc");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <p><%=userAcc%>，欢迎你</p>
    <p><a href="<c:url value="/DoServlet051203"/>">Click Me</a></p>
</div>
</body>
</html>
