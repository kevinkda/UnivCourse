<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/14
  Time: 09:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <jsp:useBean id="stu" class="com.kevinkda.univ.course.web.test20200514.domain.Student"/>
    <c:set target="${stu}" property="id" value="920"/>
    <c:set target="${stu}" property="name" value="Kevin"/>
    <c:set target="${stu}" property="sex" value="1"/>

    <p><c:out value="${stu.id}"/></p>
    <p><c:out value="${stu.name}"/></p>
    <p><c:out value="${stu.sex}"/></p>
</div>
</body>
</html>
