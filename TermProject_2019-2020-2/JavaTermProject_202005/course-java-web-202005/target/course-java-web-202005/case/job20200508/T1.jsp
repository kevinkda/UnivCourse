<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/7
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <%--    <form action="#">--%>
    <p><label for="userID">账号：</label><input type="text" id="userID"></p>
    <p><label for="userAcc">姓名：</label><input type="text" id="userAcc"></p>
    <p>
        <input type="radio" id="man" name="sex" value="1">
        <label for="man">Man</label>
        <input type="radio" id="woman" name="sex" value="0">
        <label for="woman">Woman</label>
    </p>
    <p><input type="button" value="Submit" onclick="workA();"></p>
    <%--    </form>--%>
</div>
</body>
<script src="../../js/job20200508/T1.js"></script>
</html>
