<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/7
  Time: 09:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="sign.jsp">
        <p><label for="userAcc">姓名：</label><input type="text" id="userAcc"></p>
        <p><label for="userPass">性别：</label><input type="text" id="userPass"></p>
        <p>
            <label for="man">Man</label><input type="radio" id="man" name="sex" value="1">
            <label for="woman">Woman</label><input type="radio" id="woman" name="sex" value="1">
        </p>
        <p><input type="submit" onclick="workA();"></p>
    </form>
</div>
</body>
<script src="../../js/20200507/T1.js"></script>
</html>
