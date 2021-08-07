<%--
  Created by IntelliJ IDEA.
  User: kevinkda
  Date: 2020/5/17
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>job20200517</title>
    <style>
        #accessTag {
            color: red;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="core">
        <h2>job20200517 - Login</h2>
        <h3 id="accessTag">${sessionScope.accessErr}</h3>
        <form action="${pageContext.request.contextPath}/LoginServlet0517">
            <p>
                <label for="userAcc">userAcc: </label>
                <input type="text" id="userAcc" name="userAcc">
            </p>
            <p>
                <label for="userPass">userPass: </label>
                <input type="password" id="userPass" name="userPass">
            </p>
            <p><input type="submit" value="Submit"></p>
        </form>
    </div>
</div>
</body>
</html>
