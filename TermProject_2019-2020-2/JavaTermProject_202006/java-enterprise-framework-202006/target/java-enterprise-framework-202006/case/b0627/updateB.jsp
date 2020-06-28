<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/6/21
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    request.setAttribute("authorId", request.getParameter("authorId"));
    request.setAttribute("authorName", request.getParameter("authorName"));
    request.setAttribute("authorAge", request.getParameter("authorAge"));
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <%--    <form action="${pageContext.request.contextPath}/BlogServlet0624?operType=updateA" method="get">--%>
    <form action="${pageContext.request.contextPath}/AuthorServlet0627" method="post">
        <input type="hidden" id="operType" name="operType" value="updateA">
        <input type="hidden" id="authorId" name="authorId" value="${requestScope.authorId}">
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
