<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/2/21
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.kevin.job20200223.work2.pojo.News" %>
<%@ page import="java.util.List" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%
    //Object obj=request.getAttribute("list");
//List<News> list=(List<News>)obj;
    String account;
    account = session.getAttribute("account").toString();
    String sessionId = session.getId();
    List<News> list = (List<News>) request.getAttribute("list");
//转发的数据的作用域范围只在我的转发的页面
%>
<html>
<head>
    <title>job20200223</title>
    <link rel="stylesheet" href="../../css/index.css">
</head>
<body>
<div class="container">
    <div class="top-wapper">
        <h1 id="top-word">job20200223</h1>
        <h4>This is a registration page from Kevin</h4>
    </div>

    <div class="core-wapper">
        <div class="word-wapper">
            <h1>
                SUCCESS 欢迎你:<%=account%>
            </h1>
            <%=sessionId%>
            <table>
                <tr>
                    <td>新闻ID</td>
                    <td>新闻名称</td>
                    <td>新闻内容</td>
                </tr>
                <%
                    for (int i = 0; i < list.size(); i++) {
                        News n = list.get(i);
                %>
                <tr>
                    <td><%=n.getNewsTitleId()%>
                    </td>
                    <td><%=n.getNewsTitleName()%>
                    </td>
                    <td><%=n.getNewsTitleContext()%>
                    </td>
                </tr>
                <%
                    }
                %>
            </table>
        </div>
    </div>

    <div class="bottom-wapper">
        <hr>
        <p class="complete">Completion Date: February 21, 2020</p>
    </div>
</div>
</body>
<script src="../../js/Copyright.js"></script>
</html>
