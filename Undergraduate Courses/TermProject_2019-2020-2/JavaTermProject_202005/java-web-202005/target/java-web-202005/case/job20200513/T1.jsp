<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/12
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body><c:url value=""/>
<div class="container">
    <p><a href="<c:url value="T1-show.jsp"/>">点击查看</a></p>
    <p><a href="<c:url value="T1-reg.jsp"/>">注册</a></p>
    <p><a href="<c:url value="T1-modify.jsp"/>">修改</a></p>
    <p><a href="<c:url value="T1-delete.jsp"/>">删除</a></p>
</div>
</body>
</html>
