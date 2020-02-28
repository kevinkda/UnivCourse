<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/2/21
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%String account = session.getAttribute("account").toString(); %>
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
            <%=account%>
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
