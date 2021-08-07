<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/20
  Time: 09:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="core-wrapper">
        <div class="core">
            <!--      <form action="manager.html" method="post" onsubmit="">-->
            <form action="#" method="post" id="loginForm" onsubmit="return false">
                <input type="hidden" id="userType-admin" name="userType" value="admin">
                <p>
                    <label for="userAcc">User Name</label>
                    <input type="text" name="userAcc" id="userAcc" placeholder="UserName">
                </p>
                <p>
                    <label for="userPass">User Pass</label>
                    <input type="password" name="userPass" id="userPass" placeholder="Password">
                </p>
                <!--        <p><input type="submit" value="Submit"></p>-->
                <p><input type="submit" value="Sign In" onclick="loginNow()"></p>
                <div id="accTag" style="visibility: hidden"></div>
            </form>
        </div>
    </div>
</div>
</body>
<script src="../../js/20200520/T1.js"></script>
</html>
