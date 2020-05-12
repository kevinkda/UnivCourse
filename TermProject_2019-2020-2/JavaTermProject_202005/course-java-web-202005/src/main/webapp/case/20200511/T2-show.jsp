<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/11
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<String> userList = (List<String>) application.getAttribute("userList");
    request.setAttribute("userList", userList);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<c:forEach items="${userList}" var="u">--%>
<%--    <c:out value="${u}"/>--%>
<%--</c:forEach>--%>

<%--<c:if test="${not empty userList}">--%>
<%--    124--%>
<%--</c:if>--%>

<%
    for (String u :
            userList) {
%>

<%=u%> <br/>

<%
    }
%>
</body>
</html>
