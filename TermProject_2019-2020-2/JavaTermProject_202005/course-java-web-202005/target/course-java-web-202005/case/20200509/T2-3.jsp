<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/9
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>T2-3</title>
</head>
<body>
<h2>T2-3</h2>
<%--<c:if test="${sessionScope.get('userAcc') eq null}">--%>
<%--    <%--%>
<%--    response.sendRedirect("T2.jsp");--%>
<%--    %>--%>
<%--</c:if>--%>
<%--sjldsg--%>
<%
    if (session.getAttribute("userAcc") == null) {
        response.sendRedirect("T2.jsp");
    } else {
%>
<%=session.getAttribute("userAcc")%>
<%=session.getAttribute((String) session.getAttribute("userAcc"))%>
<%
    }
%>
</body>
</html>
