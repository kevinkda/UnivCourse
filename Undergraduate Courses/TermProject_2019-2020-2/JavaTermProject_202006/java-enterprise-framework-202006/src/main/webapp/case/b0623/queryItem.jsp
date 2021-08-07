<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/6/21
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        span {
            margin-right: 3em;
        }
    </style>
</head>
<body>
<div class="container">
    <h3>Blog</h3>
    <div>
        <span>Author ID: ${sessionScope.blogItem.author.authorId}</span>
        <span>Author Name: ${sessionScope.blogItem.author.authorName}</span>
        <span>Author Age: ${sessionScope.blogItem.author.authorAge}</span>
    </div>
    <div>
        <p>
            <span>Blog ID: ${sessionScope.blogItem.blog.blogId}</span>
            <span>Blog Count: ${sessionScope.blogItem.blog.blogCount}</span>
        </p>
        <p>Blog Title: ${sessionScope.blogItem.blog.blogTitle}</p>
    </div>
    <hr>
    <div>
        <c:forEach var="comment" items="${sessionScope.blogItem.comment}">
            <p>Comment Content ---- ${comment.commentTime}</p>
            <p>${comment.content}</p>
        </c:forEach>
    </div>
</div>
</body>
</html>
