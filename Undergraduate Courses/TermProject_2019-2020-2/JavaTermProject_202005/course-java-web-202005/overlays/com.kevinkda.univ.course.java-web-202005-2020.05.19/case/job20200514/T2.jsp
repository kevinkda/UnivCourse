<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.kevinkda.univ.course.web.job20200514.domain.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/14
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    List<Student> list = new ArrayList<Student>();
    for (int i = 0; i < 10; i++) {
        list.add(new Student(
                i * 3 + 10,
                "student" + i,
                i * 2 + 10
        ));
    }
    request.setAttribute("stuList", list);
%>
<html>
<head>
    <title>Title</title>
    <style>
        td {
            width: 8em;
        }
    </style>
</head>
<body>
<div class="container">
    <div>
        <h2>Student List</h2>
        <table>
            <tr>
                <td>Student ID</td>
                <td>Name</td>
                <td>Age</td>
            </tr>
            <c:forEach items="${stuList}" var="i">
                <tr>
                    <td>${i.id}</td>
                    <td>${i.name}</td>
                    <td>${i.age}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div style="margin-top: 5em;">
        <h2>Student List - Last Item</h2>
        <table>
            <tr>
                <td>Student ID</td>
                <td>Name</td>
                <td>Age</td>
            </tr>
            <c:forEach items="${stuList}" var="i" varStatus="status">
                <c:if test="${status.last}">
                    <tr>
                        <td>${i.id}</td>
                        <td>${i.name}</td>
                        <td>${i.age}</td>
                    </tr>
                </c:if>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
