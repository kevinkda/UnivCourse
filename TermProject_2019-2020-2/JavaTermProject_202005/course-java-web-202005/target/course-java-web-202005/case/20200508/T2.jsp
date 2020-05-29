<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/8
  Time: 08:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="T2-2.jsp" method="post">
        <p>
            <label for="userAcc">UserAccount</label>
            <input type="text" name="userAcc" id="userAcc">
        </p>
        <p>
            <label for="userPass">UserPass</label>
            <input type="password" name="userPass" id="userPass">
        </p>
        <p><input type="submit" id="btn-sub" value="Submit"></p>
    </form>
</div>
</body>
</html>
