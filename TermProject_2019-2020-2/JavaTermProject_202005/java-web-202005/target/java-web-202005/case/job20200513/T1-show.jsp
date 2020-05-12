<%@ page import="com.kevinkda.univ.course.web.job20200513.domain.News" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/12
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <%
        if (application.getAttribute("newsList") == null) {
    %>
    <p>暂无数据</p>
    <%
    } else {
        List<News> list = (List<News>) application.getAttribute("newsList");
    %>
    <table>
        <tr>
            <td>新闻ID</td>
            <td>新闻标题</td>
        </tr>
        <%
            for (int i = 0; i < list.size(); i++) {
                News n = list.get(i);
        %>
        <tr>
            <td><%=n.getNewsId()%>
            </td>
            <td><%=n.getNewsTitle()%>
            </td>
        </tr>
        <%
            }
        %>

    </table>
    <%
        }
    %>
</div>
</body>
</html>
