<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/12
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    List<String> userList = (List<String>) application.getAttribute("userList");
    request.setAttribute("userList", userList);
    int count = userList.size();
    request.setAttribute("count", count);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <%--<c:forEach items="${userList}" var="u">--%>
    <%--    <c:out value="${u}"/>--%>
    <%--</c:forEach>--%>

    <%--<c:if test="${not empty userList}">--%>
    <%--    124--%>
    <%--</c:if>--%>
    <p>当前在线用户数：<span><%=count%></span></p>
    <%
        for (String u :
                userList) {
    %>

    <%=u%> <br/>

    <%
        }
    %>
</div>
</body>
</html>
