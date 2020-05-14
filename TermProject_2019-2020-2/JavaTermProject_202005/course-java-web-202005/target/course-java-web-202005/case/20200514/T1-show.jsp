<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/14
  Time: 09:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <table>
        <tr>
            <td>ID</td>
            <td>姓名</td>
            <td>性别</td>
        </tr>
        <jsp:useBean id="list" scope="request" type="java.util.List"/>
        <c:forEach items="${list}" var="i" varStatus="status">
            <tr>
                <td><c:out value="${i.id}"/></td>
                <td><c:out value="${i.name}"/></td>
                <c:if test="${i.sex eq 1}">
                    <td style="color: blue">Man</td>
                </c:if>
                <c:if test="${i.sex eq 0}">
                    <td style="color: red">Woman</td>
                </c:if>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
