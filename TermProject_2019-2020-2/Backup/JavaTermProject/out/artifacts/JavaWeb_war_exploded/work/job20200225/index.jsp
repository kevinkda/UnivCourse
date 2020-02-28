<%--
  ~ Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
  ~ Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
  ~ Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
  ~ Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
  ~ Vestibulum commodo. Ut rhoncus gravida arcu.
  --%>

<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/2/21
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
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
            <p>友情提示：暂未实现用户数据库登录功能，请直接点击登录</p>
            <form action="${pageContext.request.contextPath}/Login0225Servlet" method="post">
                <input type="text" name="account" value="user"/>
                <input type="text" name="password" value="user"/>
                <input type="submit"/>
            </form>


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
