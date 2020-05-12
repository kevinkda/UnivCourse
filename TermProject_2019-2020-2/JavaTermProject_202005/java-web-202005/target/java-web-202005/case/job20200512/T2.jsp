<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/12
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="core-wrapper">
        <div class="login-wrapper">
            <p>Login</p>
            <form action="<c:url value="/LoginServlet051202"/>" method="get" onsubmit="checkUserAcc()">
                <%--        <form action="${pageContext.request.contextPath}/LoginServlet0511" method="get" onsubmit="checkUserAcc()">--%>
                <p>
                    <label for="userAcc">账号：</label>
                    <input type="text" name="userAcc" id="userAcc" required>
                </p>
                <p>
                    <input type="submit" value="Reg">
                </p>
            </form>
        </div>
        <br>
        <div class="exit-wrapper">
            <p>Exit</p>
            <form action="<c:url value="/ExitServlet0512"/>" method="get" onsubmit="checkUserAcc()">
                <%--        <form action="${pageContext.request.contextPath}/LoginServlet0511" method="get" onsubmit="checkUserAcc()">--%>
                <p>
                    <label for="userAcc">账号：</label>
                    <input type="text" name="userAccExit" id="userAccExit" required>
                </p>
                <p>
                    <input type="submit" value="Reg">
                </p>
            </form>
        </div>
    </div>
</div>
</body>
</html>
