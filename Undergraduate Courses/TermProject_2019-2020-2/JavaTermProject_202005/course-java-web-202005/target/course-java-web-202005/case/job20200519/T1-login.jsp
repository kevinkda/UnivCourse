<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/19
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <form action="${pageContext.request.contextPath}/UserServlet0519" method="post">
        <p>
            <label for="userAcc">账号:</label>
            <input type="text" id="userAcc" name="userAcc"/>
        </p>
        <p><input type="submit"/></p>
    </form>
</div>
</body>
</html>
