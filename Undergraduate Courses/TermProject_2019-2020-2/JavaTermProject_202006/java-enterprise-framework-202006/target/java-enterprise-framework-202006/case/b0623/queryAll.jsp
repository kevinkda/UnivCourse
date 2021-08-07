<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/6/21
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <table>
        <tr>
            <td>blogID</td>
            <td>blogTitle</td>
            <td>blogCount</td>
            <td>authorId</td>
            <td>update</td>
            <td>delete</td>
        </tr>
        <c:forEach var="comment" items="${sessionScope.blogList}">
            <tr>
                <td>${comment.blogId}</td>
                <td>${comment.blogTitle}</td>
                <td>${comment.blogCount}</td>
                <td>${comment.authorId}</td>
                <td><a href="${pageContext.request.contextPath}/BlogServlet0623?operType=queryItem&blogId=${comment.blogId}">detailed</a>
                <td><a href="${pageContext.request.contextPath}/BlogServlet0623?operType=updateB&blogId=${comment.blogId}">update</a>
                </td>
                <td>
                    <a href="updateB.jsp?operType=updateB&blogId=${comment.blogId}&blogTitle=${comment.blogTitle}&blogCount=${comment.blogCount}">update</a>
                </td>
                <td><a href="${pageContext.request.contextPath}/BlogServlet0623?operType=delete&blogId=${comment.blogId}">delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
