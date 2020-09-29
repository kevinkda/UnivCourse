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
            <td>authorId</td>
            <td>authorName</td>
            <td>authorAge</td>
            <td>update</td>
            <td>delete</td>
        </tr>
        <c:forEach var="comment" items="${sessionScope.authorList}">
            <tr>
                <td>${comment.authorId}</td>
                <td>${comment.authorName}</td>
                <td>${comment.authorAge}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/AuthorServlet0627?operType=queryItem&blogId=${comment.authorId}">detailed</a>
                <td>
                    <a href="${pageContext.request.contextPath}/AuthorServlet0627?operType=updateB&blogId=${comment.authorId}">update</a>
                </td>
                <td>
                    <a href="updateB.jsp?operType=updateB&authorId=${comment.authorId}&authorName=${comment.authorName}&authorAge=${comment.authorAge}">update</a>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath}/AuthorServlet0627?operType=delete&authorId=${comment.authorId}">delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
