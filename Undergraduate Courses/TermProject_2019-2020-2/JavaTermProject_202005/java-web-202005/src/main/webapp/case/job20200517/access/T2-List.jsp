<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/17
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String userAcc = (String) session.getAttribute("userAcc");
    int flag = userAcc.equals("admin") ? 1 : 0;
    request.setAttribute("flag", flag);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="core">
        <h3 id="accessTag">${sessionScope.accessErrB}</h3>
        <%
            session.removeAttribute("accessErrB");
        %>
        <ul>
            <c:if test="${flag eq 1}">
                <li>
                    <a href="admin/T2-admin.jsp">Admin</a>
                </li>
                <li>
                    <a href="user/T2-user.jsp">User</a>
                </li>
            </c:if>
            <c:if test="${flag eq 0}">
                <li>
                    <a href="user/T2-user.jsp">User</a>
                </li>
            </c:if>
        </ul>
    </div>
</div>
</body>
</html>
