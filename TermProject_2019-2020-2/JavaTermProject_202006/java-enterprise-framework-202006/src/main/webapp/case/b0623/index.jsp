<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/6/21
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ page import="com.kevinkda.univ.course.enter.framework.b20200621.service.BlogService" %>
<%@ page import="com.kevinkda.univ.course.enter.framework.b20200621.domain.Blog" %>
<%@ page import="java.util.List" %>
<%
//    List<Blog> blogs = BlogService.getBlogList();
//    Blog blog = BlogService.getBlogItemById(1);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <%--    <%--%>
    <%--        System.out.println("blogs = " + blogs);--%>
    <%--        response.getWriter().append("blogs = ").append(String.valueOf(blogs));--%>
    <%--        response.getWriter().append("<br/>");--%>
    <%--        response.getWriter().append("blogItem = ").append(blog.toString());--%>
    <%--    %>--%>
    <ul>
        <li><a href="${pageContext.request.contextPath}/BlogServlet0623?operType=queryAll">Query All</a></li>
<%--        <li><a href="case/queryItem.jsp">Query Item</a></li>--%>
        <li><a href="insert.jsp">insert</a></li>
<%--        <li><a href="case/update.jsp">update</a></li>--%>
<%--        <li><a href="case/delete.jsp">delete</a></li>--%>
    </ul>
</div>
</body>
</html>
