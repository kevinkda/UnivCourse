<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/11
  Time: 09:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userAcc = (String) session.getAttribute("userAcc");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p><%=userAcc%>，欢迎你</p>
<p><a href="<c:url value="/DoServlet0511"/>" >Click Me</a></p>
</body>
</html>
