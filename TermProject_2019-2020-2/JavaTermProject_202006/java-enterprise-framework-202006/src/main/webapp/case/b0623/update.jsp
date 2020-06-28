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
</head>
<body>
<div class="container">
    <form action="${pageContext.request.contextPath}/BlogServlet0623?operType=updateA" method="get">
        <p>
            <label for="blogId">blogId</label>
            <input type="text" id="blogId" value="${sessionScope.blogItem.blogId}">
        </p>
        <p>
            <label for="blogTitle">blogTitle</label>
            <input type="text" id="blogTitle" value="${sessionScope.blogItem.blogTitle}">
        </p>
        <p>
            <label for="blogCount">blogCount</label>
            <input type="text" id="blogCount" value="${sessionScope.blogItem.blogCount}">
        </p>
        <p><input type="submit"></p>
    </form>
</div>
</body>
</html>
