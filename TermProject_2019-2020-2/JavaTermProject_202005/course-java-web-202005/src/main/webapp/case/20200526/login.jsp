<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/26
  Time: 09:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Login</title>
    <script src="../../js/jquery-1.12.4.js"></script>
</head>
<body>
<div class="container">
    <form action="admin/index.jsp" method="post">
        <p>
            <label for="userNick">Nick:</label>
            <input type="text" id="userNick" name="userNick" onblur="checkNick();">
        </p>
        <p><span>Sex:</span>
            <label for="sex-man">Man</label><input type="radio" id="sex-man" name="sex" value="1">
            <label for="sex-woman">Woman</label><input type="radio" id="sex-woman" name="sex" value="0">
        </p>
        <%--        <p>--%>
        <%--            <label for=""></label>--%>
        <%--            <input type="text">--%>
        <%--        </p>--%>
        <p>
            <input type="submit" onclick="loginNow();">
        </p>
        <p id="errTag"></p>
    </form>
</div>
</body>
<script src="../../js/20200526/login.js"></script>
</html>
