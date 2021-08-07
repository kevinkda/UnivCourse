<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/6/21
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    request.setAttribute("blogId", request.getParameter("blogId"));
    request.setAttribute("blogTitle", request.getParameter("blogTitle"));
    request.setAttribute("blogCount", request.getParameter("blogCount"));
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <%--    <form action="${pageContext.request.contextPath}/BlogServlet0624?operType=updateA" method="get">--%>
    <form action="${pageContext.request.contextPath}/BlogServlet0624" method="post">
        <input type="hidden" id="operType" name="operType" value="updateA">
        <input type="hidden" id="blogId" name="blogId" value="${requestScope.blogId}">
        <%--        <p>--%>
        <%--            <label for="blogId">blogId</label>--%>
        <%--            <input type="text" id="blogId" value="${requestScope.blogId}">--%>
        <%--        </p>--%>
        <p>
            <label for="blogTitle">blogTitle</label>
            <input type="text" id="blogTitle" name="blogTitle" value="${requestScope.blogTitle}">
        </p>
        <p>
            <label for="blogCount">blogCount</label>
            <input type="text" id="blogCount" name="blogCount" value="${requestScope.blogCount}">
        </p>
        <p><input type="submit"></p>
    </form>
</div>
</body>
</html>
