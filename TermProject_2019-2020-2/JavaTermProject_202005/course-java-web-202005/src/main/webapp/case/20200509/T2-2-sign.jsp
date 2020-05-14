<%--<%@ page import="com.kevinkda.util.str.StringProcess" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/8
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String userAcc = request.getParameter("userAcc");
    String userPass = request.getParameter("userPass");
    session.setAttribute("userAcc", userAcc);
    session.setAttribute("userPass", userPass);
//    session.setAttribute(userAcc, new Uuid().toUpperCase(session.getId()));
    session.setAttribute(userAcc, session.getId());
    response.sendRedirect("T2-3.jsp");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<%=userAcc%>--%>
<%--<%=userPass%>--%>
</body>
</html>
