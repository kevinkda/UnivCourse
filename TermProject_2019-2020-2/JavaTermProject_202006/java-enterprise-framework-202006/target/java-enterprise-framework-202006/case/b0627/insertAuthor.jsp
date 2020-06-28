<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/6/24
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <form action="${pageContext.request.contextPath}/AuthorServlet0627" method="get">
        <input type="hidden" id="operType" name="operType" value="insertAuthor">
        <%--        <p>--%>
        <%--            <label for="blogId">blogId</label>--%>
        <%--            <input type="text" id="blogId" value="${requestScope.blogId}">--%>
        <%--        </p>--%>
        <p>
            <label for="authorName">authorName</label>
            <input type="text" id="authorName" name="authorName" value="${requestScope.authorName}">
        </p>
        <p>
            <label for="authorAge">authorAge</label>
            <input type="text" id="authorAge" name="authorAge" value="${requestScope.authorAge}">
        </p>
        <p><input type="submit"></p>
    </form>
</div>
</body>
</html>
